package com.test.dao;

import com.test.entity.Income;

import java.util.List;

public interface IncomeDao {

    public int insertIncome(Income obj);

    public int deleteIncome(int id);

    public int updateIncome(Income obj);

    public Income findById(int id);

    public List findAll();
}
