package com.OlatunjiOjuko;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Using CONSTRUCTURS to create objects of our class
        bankAccount JosephBobAccount = new bankAccount(23456789, 10500, "Joseph Bob", "Joseph@bob.com", "01728377318");
        bankAccount MaryJaneAccount = new bankAccount(83938849, 83000, "Mary Jane", "maryjane@gmail.com", "39287379911");
        bankAccount MuhammadSuleAccount = new bankAccount();

        MaryJaneAccount.getBalance();
        System.out.println("************************************");
        //bankAccount currentAccount = new bankAccount();
        //JosephBobAccount.setAccountNumber(23456789);
        //JosephBobAccount.setBalance(5000.00);
        //JosephBobAccount.setDeposit(1500);
        //JosephBobAccount.getBalance();
        JosephBobAccount.getBalance();
        JosephBobAccount.getDeposit();
        JosephBobAccount.setWithdrawal(7500);
        System.out.println("*************************************");
        MuhammadSuleAccount.getBalance();
        System.out.println("****************CONSTRUCTORS***************");
        VipCustomer customerFrancis = new VipCustomer("Francis Obi", 2000);
        System.out.println(customerFrancis.getName());
        VipCustomer customerTina = new VipCustomer();
        System.out.println(customerTina.getName());
        VipCustomer customerAndy = new VipCustomer("Andy Murray", 5000, "andymurray@mail.com");
        System.out.println(customerAndy.getName());







    }
}
