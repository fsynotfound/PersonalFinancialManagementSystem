package com.test.entity;

public class Income {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Income(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Income() {
    }

    public Income(String name) {
        this.name = name;
    }
}
