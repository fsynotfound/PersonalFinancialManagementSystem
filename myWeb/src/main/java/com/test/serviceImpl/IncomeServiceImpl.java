package com.test.serviceImpl;

import com.test.dao.IncomeDao;
import com.test.entity.Income;
import com.test.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {
    @Autowired
    private IncomeDao incomeDao;

    @Override
    public int insertIncome(Income obj) {
        return incomeDao.insertIncome(obj);
    }

    @Override
    public int deleteIncome(int id) {
        return incomeDao.deleteIncome(id);
    }

    @Override
    public int updateIncome(Income obj) {
        return incomeDao.updateIncome(obj);
    }

    @Override
    public Income findById(int id) {
        return incomeDao.findById(id);
    }

    @Override
    public List findAll() {
        return incomeDao.findAll();
    }
}
