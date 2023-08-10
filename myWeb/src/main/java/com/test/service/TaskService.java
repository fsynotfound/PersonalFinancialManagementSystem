package com.test.service;

import com.test.entity.Task;

import java.util.List;

public interface TaskService {
    public int insert(Task task);

    public int delete(int taskId);

    public int update(Task task);

    public int deleteBatch(int array[]);

    public Task findById(int taskId);

    public List findAll();
}
