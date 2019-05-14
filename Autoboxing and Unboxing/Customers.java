package com.OlatunjiOjuko;

import java.util.ArrayList;

public class Customers {
    private ArrayList<Double> transactions = new ArrayList<>();
    private String custID;
    private String name;
    private String accountNumber;
    private double accountBalance;
    private double initialDeposit;



    public Customers(String custID, String name, String accountNumber, double accountBalance, double initialDeposit) {

        this.custID = custID;
        this.name = name;
        //this.firstName = firstName;
        this.accountNumber = accountNumber;
        this.accountBalance = getAccountBalance();
        this.initialDeposit = initialDeposit;
        this.transactions = transactions;
        addInitialDeposit(initialDeposit);
    }
    public void addInitialDeposit(double amount){
        transactions.add(amount);
    }
    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustID() {
        return custID;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public static Customers customerConstructor(String custID, String name, String accountNumber, double accountBalance, double initalDeposit){

        return new Customers(custID,name,accountNumber,accountBalance, initalDeposit);
    }
}
