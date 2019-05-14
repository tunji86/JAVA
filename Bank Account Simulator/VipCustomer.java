package com.OlatunjiOjuko;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    //Constructors
    public VipCustomer(){
        this("Unknown name", 0.0, "Unknown email address");

        //this.name = name;
        //this.creditLimit = creditLimit;
        //this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        //this.name = name;
        //this.creditLimit = creditLimit;
        //this.emailAddress = "Unknown Email Address";
        this(name, creditLimit, "Unknown Email Address");

    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}


