package com.test.service;

import com.test.entity.Income;

import java.util.List;

public interface IncomeService {
    public int insertIncome(Income obj);

    public int deleteIncome(int id);

    public int updateIncome(Income obj);

    public Income findById(int id);

    public List findAll();
}
