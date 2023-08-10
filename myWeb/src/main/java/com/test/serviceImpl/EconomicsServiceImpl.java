package com.test.serviceImpl;

import com.test.dao.EconomicsDao;
import com.test.entity.Economics;
import com.test.service.EconomicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "economicsService")
public class EconomicsServiceImpl implements EconomicsService {

    @Autowired
     private EconomicsDao economicsDao;

    @Override
    public int insert(Economics es) {
        return economicsDao.insert(es);
    }

    @Override
    public int delete(int id) {
        return economicsDao.delete(id);
    }

    @Override
    public int update(Economics es) {
        return economicsDao.update(es);
    }

    @Override
    public Economics findById(int id) {
        return economicsDao.findById(id);
    }

    @Override
    public List findAll() {
        return economicsDao.findAll();
    }
}
