package com.test.controller;

import com.test.entity.Income;
import com.test.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/income")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @RequestMapping(value = "/insert.do")
    public ModelAndView insert(Income obj){
       int result =  incomeService.insertIncome(obj);
       ModelAndView mv = new ModelAndView();
       if(result == 1){
           mv.addObject("info","收入类型添加成功");
       }else{
           mv.addObject("info","收入类型添加失败");
       }
       mv.setViewName("info"); //jsp文件的文件名
       return mv;
    }
    @RequestMapping(value = "/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List list = incomeService.findAll();
        mv.addObject("list",list);
        mv.setViewName("income_show");//jsp文件的文件名
        return mv;
    }
    @RequestMapping(value = "/delete.do")
    public ModelAndView delete(int id){
        int result = incomeService.deleteIncome(id);
        ModelAndView mv = new ModelAndView();
        if(result == 1){
            mv.addObject("info","收入类型删除成功");
        }else{
            mv.addObject("info","收入类型删除失败");
        }
        mv.setViewName("info");
        return mv;
    }

      @RequestMapping(value = "/findById.do")
      public ModelAndView findById(int id){
        ModelAndView mv = new ModelAndView();
        Income income = incomeService.findById(id);
        mv.addObject("income",income);
        mv.setViewName("income_edit");
        return mv;
      }
    @RequestMapping(value = "/update.do")
      public String update(Income income){
        incomeService.updateIncome(income);
        return "forward:/income/findAll.do";
      }

    @ResponseBody
    @RequestMapping(value = "/ajax.do")
    public List<Income> ajax(){
        List<Income> list =  incomeService.findAll();
        return list;
    }

}
