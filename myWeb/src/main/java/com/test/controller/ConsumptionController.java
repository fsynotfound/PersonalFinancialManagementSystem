package com.test.controller;

import com.test.entity.Consumption;
import com.test.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/consumption")
public class ConsumptionController {

    @Autowired
    @Qualifier(value = "consumptionService")
    private ConsumptionService consumptionService;

    //一级消费类型注册
    @RequestMapping(value = "/first_insert.do")
    public ModelAndView firstInsert(Consumption obj){
          int result =-1;//表示失败
          ModelAndView mv = new ModelAndView();
         //1.调用业务类对象完成服务
         result =consumptionService.insertConsumption(obj);
         //2.处理结果
         if(result<=0){
             mv.addObject("info","一级消费类型添加失败");
         }else{
             mv.addObject("info","一级消费类型添加成功");
         }
         mv.setViewName("info");
        return mv;
    }
    //一级消费类型删除

    @RequestMapping(value = "/delete/first.do")
    public ModelAndView deleteFirst(int id){
        int result =-1;
        ModelAndView mv = new ModelAndView();
        //1.调用service处理服务
        result = consumptionService.deleteFirstConsumption(id);
        //2.处理结果
        if(result<=0){
            mv.addObject("info","一级消费类型删除失败");
        }else{
            mv.addObject("info","一级消费类型删除成功");
        }
        mv.setViewName("info");
        return mv;
    }


    //根据id编号查询消费类型详细信息
    @RequestMapping(value = "/findById.do")
    public ModelAndView findById(int id){
        Consumption cp = null;
        ModelAndView mv = new ModelAndView();
        //1.调用业务对象提供服务
        cp =  consumptionService.findById(id);
        //2.处理结果

        mv.addObject("result",cp);

        mv.setViewName("first_Consumption_info");
        return mv;
    }



    //一级消费类型查询
    @RequestMapping(value = "/first_findAll.do")
    public ModelAndView findFirst(){
             List consumptionList = null;
             ModelAndView mv = new ModelAndView();
            //1.调用service提供所有一级消费类型
             consumptionList =consumptionService.findFirstConsumption();
            //2.结果处理
            mv.addObject("list",consumptionList);
            mv.setViewName("comsumption_first_show");
            return mv;
    }

    //消费类型更新
    @RequestMapping(value = "/update.do")
    public ModelAndView updateConsumption(Consumption obj){
        int result =-1;//表示失败
        ModelAndView mv = new ModelAndView();
        //1.调用业务类对象完成服务
        result =consumptionService.updateConsumption(obj);
        //2.处理结果
        if(result<=0){
            mv.addObject("info","消费类型更新失败");
        }else{
            mv.addObject("info","消费类型更新成功");
        }
        mv.setViewName("info");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value="/ajax.do")
    public List<Consumption> ajax(){
        List<Consumption> list =  consumptionService.findFirstConsumption();
        return list;
    }





}
