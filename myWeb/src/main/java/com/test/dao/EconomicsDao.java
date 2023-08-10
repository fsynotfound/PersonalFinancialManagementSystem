package com.test.dao;

import com.test.entity.Economics;

import java.util.List;

public interface EconomicsDao {

    public int insert(Economics es);

    public int delete(int id);

    public int update(Economics es);

    public Economics findById(int id);

    public List findAll();
}
