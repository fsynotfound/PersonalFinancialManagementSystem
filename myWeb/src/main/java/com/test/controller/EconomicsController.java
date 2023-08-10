package com.test.controller;

import com.test.entity.Economics;
import com.test.service.EconomicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/economics")
public class EconomicsController {

    @Autowired
    private EconomicsService economicsService;

    @RequestMapping(value = "/insert.do")
    public ModelAndView insert(Economics es){
         int result =  economicsService.insert(es);
         ModelAndView mv = new ModelAndView();
         if(result ==1){
             mv.addObject("info","收支记录添加成功");
         }else{
             mv.addObject("info","收支记录添加失败");
         }
         mv.setViewName("info");
         return mv;
    }

    @RequestMapping(value="/find.do")
    public ModelAndView find(){
       List list =  economicsService.findAll();
       ModelAndView mv = new ModelAndView();
       mv.addObject("list",list);
       mv.setViewName("economics");
       return mv;
    }

    @RequestMapping(value="/delete.do")
    public String delete(int id){
        economicsService.delete(id);
        return "forward:/economics/find.do";
    }


}
