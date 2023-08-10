package com.test.dao;

import com.test.entity.Consumption;

import java.util.List;

public interface ConsumptionDao {

    //1.消费类型添加
    public int insert(Consumption obj);
    //2.一级消费类型查询
    public List findAllFirstConsumption();
    //3.消费类型更新
    public int update(Consumption obj);
    //4.一级消费类型删除
    public int delete(int id);
    //5.根据ID编号查询消费类型详细信息
    public Consumption findById(int id);

}
