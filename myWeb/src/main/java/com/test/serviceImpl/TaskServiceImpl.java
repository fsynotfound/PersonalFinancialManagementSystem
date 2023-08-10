package com.test.serviceImpl;

import com.test.dao.TaskDao;
import com.test.entity.Task;
import com.test.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "taskService")
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public int insert(Task task) {
        return taskDao.insert(task);
    }

    @Override
    public int delete(int taskId) {
        return taskDao.delete(taskId);
    }

    @Override
    public int update(Task task) {
        return taskDao.update(task);
    }

    @Override
    public int deleteBatch(int[] array) {
        return taskDao.deleteBatch(array);
    }

    @Override
    public Task findById(int taskId) {
        return taskDao.findById(taskId);
    }

    @Override
    public List findAll() {
        return taskDao.findAll();
    }
}
