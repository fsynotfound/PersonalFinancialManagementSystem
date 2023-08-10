package com.test.entity;

public class Task {
    private Integer id;
    private String  title;
    private int month;
    private int money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Task(Integer task, String title, int month, int money) {
        this.id = task;
        this.title = title;
        this.month = month;
        this.money = money;
    }

    public Task() {
    }
}
