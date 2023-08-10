package com.test.service;

import com.test.entity.Economics;

import java.util.List;

public interface EconomicsService {

    public int insert(Economics es);

    public int delete(int id);

    public int update(Economics es);

    public Economics findById(int id);

    public List findAll();
}
