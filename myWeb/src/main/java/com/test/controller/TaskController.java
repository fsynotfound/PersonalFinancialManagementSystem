package com.test.controller;

import com.test.entity.Task;
import com.test.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/insert.do")
    public ModelAndView insert(Task task){
       int result =  taskService.insert(task);
        ModelAndView mv = new ModelAndView();
        if(result ==1){
            mv.addObject("info","收支计划添加成功");
        }else{
            mv.addObject("info","收支计划添加失败");
        }
        mv.setViewName("info");
        return mv;
    }

    @RequestMapping(value = "/find.do")
    public ModelAndView findAll(){
        List taskList =taskService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("taskList",taskList);
        mv.setViewName("task");
        return mv;
    }

    @RequestMapping(value="/delete.do")
    public String delete(int id){
       taskService.delete(id);
       return "forward:/task/find.do";
    }

    @RequestMapping(value="/findById.do")
    public ModelAndView findById(int id){
        Task task =   taskService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("task",task);
        mv.setViewName("task_info");
        return mv;
    }

    @RequestMapping(value = "/update.do")
    public ModelAndView update(Task task){
        int result = taskService.update(task);
        ModelAndView mv = new ModelAndView();
        if(result ==1){
            mv.addObject("info","收支计划更新成功");
        }else{
            mv.addObject("info","收支计划更新失败");
        }
        mv.setViewName("info");
        return mv;
    }
}
