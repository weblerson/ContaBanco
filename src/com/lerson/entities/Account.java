package com.lerson.entities;

public class Account {

    private Integer number;
    private String agency;
    private Customer customer;
    private Float balance;

    public Account() {}

    public Account(Integer number, String agency, Customer customer, Float balance) {
        this.number = number;
        this.agency = agency;
        this.customer = customer;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
