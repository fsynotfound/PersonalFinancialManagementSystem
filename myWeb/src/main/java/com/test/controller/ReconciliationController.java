package com.test.controller;

import com.test.entity.Economics;
import com.test.service.EconomicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class ReconciliationController {

    @Autowired
    private EconomicsService economicsService;

    @RequestMapping(value="/reconciliation.do")
    public ModelAndView find(){
        //1.查询所有消费记录和收入记录
        List<Economics> list =economicsService.findAll();
        //2.计算余额
        double balance = 0;
        for (Economics es:list){
            if(es.getConsumptionId()!=null){
                balance-=es.getMoney();
            }else{
                balance+=es.getMoney();
            }
        }
        //3.将数据交给JSP展示
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.addObject("balance",balance);
        mv.setViewName("reconciliation");

        return mv;
    }
}
