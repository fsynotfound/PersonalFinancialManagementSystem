package com.test.serviceImpl;

import com.test.dao.ConsumptionDao;
import com.test.entity.Consumption;
import com.test.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "consumptionService") //value是自己设置的id编号
public class ConsumptionServiceImpl implements ConsumptionService {

    @Autowired
     private ConsumptionDao consumptionDao;

    @Override
    public int insertConsumption(Consumption obj) {
        if(obj.getId()==null || 0==obj.getId()){
            obj.setId(1);
        }
        return consumptionDao.insert(obj);
    }

    @Override
    public int updateConsumption(Consumption obj) {
        return consumptionDao.update(obj);
    }

    @Override
    public List findFirstConsumption() {
        return consumptionDao.findAllFirstConsumption();
    }

     //进行事务管理，实现消费类型以及消费记录级联删除
    @Override
    public int deleteFirstConsumption(int id) {
        return consumptionDao.delete(id);
    }

    @Override
    public Consumption findById(int id) {
        return consumptionDao.findById(id);
    }
}
