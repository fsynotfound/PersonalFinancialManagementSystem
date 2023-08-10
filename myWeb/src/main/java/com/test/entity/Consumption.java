package com.test.entity;

public class Consumption {

     private Integer id;
     private String  typeName;
     private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Consumption(Integer id, String typeName, Integer level) {
        this.id = id;
        this.typeName = typeName;
        this.level = level;
    }

    public Consumption() {
    }

    @Override
    public String toString() {
        return "Consumption{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", level=" + level +
                '}';
    }
}
