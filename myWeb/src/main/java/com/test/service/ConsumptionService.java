package com.test.service;

import com.test.entity.Consumption;

import java.util.List;

public interface ConsumptionService {

    //1.消费类型添加业务
    public int insertConsumption(Consumption obj);
    //2.消费类型更新业务
    public int updateConsumption(Consumption obj);
    //3.一级消费类型更新业务
    public List findFirstConsumption();
    //4.一级消费类型删除业务
    public int  deleteFirstConsumption(int id);
    //5.根据id编号查询消费类型消息信息
    public Consumption findById(int id);
}
