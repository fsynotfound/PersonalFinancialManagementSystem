package com.test.entity;

public class Economics {

     private Integer id;
     private String shop;
     private Integer incomeId;
     private Integer consumptionId;
     private Double money;
     private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }

    public Integer getConsumptionId() {
        return consumptionId;
    }

    public void setConsumptionId(Integer consumptionId) {
        this.consumptionId = consumptionId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Economics(Integer id, String shop, Integer incomeId, Integer consumptionId, Double money, String date) {
        this.id = id;
        this.shop = shop;
        incomeId = incomeId;
        consumptionId = consumptionId;
        this.money = money;
        this.date = date;
    }

    public Economics() {
    }
}
