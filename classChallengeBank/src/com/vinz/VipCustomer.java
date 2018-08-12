package com.vinz;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("default name",35000.00,"default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
       this(name, creditLimit,"xyz@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
