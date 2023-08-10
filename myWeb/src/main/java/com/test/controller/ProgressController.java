package com.test.controller;

import com.test.entity.Economics;
import com.test.entity.Task;
import com.test.service.EconomicsService;
import com.test.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProgressController {
    @Autowired
    private EconomicsService economicsService;
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/progress.do")
    public ModelAndView progress(){
        //1.查询余额
        List<Economics> list =economicsService.findAll();
        double balance = 0;
        for (Economics es:list){
            if(es.getConsumptionId()!=null){
                balance-=es.getMoney();
            }else{
                balance+=es.getMoney();
            }
        }
        //2.查询计划任务
        List<Task> taskList =taskService.findAll();
        Task task = taskList.get(0);

        //3.判断
        String status ="完成";
        if(task.getMoney() > balance){
            status="任务失败";
        }

        //4.数据输出
        ModelAndView mv = new ModelAndView();
        mv.addObject("status",status);
        mv.addObject("list",list);
        mv.addObject("task",task.getMoney());
        mv.addObject("balance",balance);
        mv.setViewName("progress");

        return mv;
    }
}
