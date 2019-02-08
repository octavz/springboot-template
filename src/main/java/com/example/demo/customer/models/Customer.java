package com.example.demo.customer.models;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private long custId;
    private String name;
    private int age;

    public Customer(){
    }

    public Customer(long custId, String name, int age)     {
        this.custId = custId;
        this.name = name;
        this.age = age;
    }

    public long getCustId() {
        return custId;
    }
    public void setCustId(long custId) {
        this.custId = custId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer [age=" + age + ", custId=" + custId + ", name=" + name
                + "]";
    }
}
