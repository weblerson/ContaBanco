package com.lerson.entities;

public class Customer {

    private String name;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
