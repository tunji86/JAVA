package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.Scanner;

public class Branches {
    private Scanner scanner = new Scanner(System.in);
    private static ArrayList<Customers> customerList = new ArrayList<>();
    private String branchName;
    private double balance;


    public Branches(String branchName) {
        this.customerList = customerList;
        //this.branchName = branchName;
    }

    public boolean addCustomers (Customers customers){
        int position = findCustomers(customers.getName());
        if(position >=0){
            System.out.println("Customer already exists.");
            return false;
        }
        customerList.add(customers);
        System.out.println("Customer: "+customers.getCustID()+" "+customers.getName()+"\n"
        +" Account Number: "+customers.getAccountNumber()+" Current balance: "+customers.getAccountBalance()+" Initial Deposit: "+customers.getInitialDeposit());
         return true;
    }



    public static void printCustomers(){
        for(int i=0; i<customerList.size();i++){
            System.out.println("Customer ID   Name   Account NUmber   Account Balance   Initial Deposit");
            System.out.println(customerList.get(i).getCustID()+" -- "+customerList.get(i).getName()+"--"
                    +" -- "+customerList.get(i).getAccountNumber()+" -- "+customerList.get(i).getAccountBalance()+" -- "+customerList.get(i).getInitialDeposit());
        }
    }

    public double depositMethod(String custID){
        int position = findCustomers(custID);
        if(position <0){
            System.out.println("No customer was found with that ID, please check.");
            return -1;
        }
        System.out.println("Enter deposit amount: ");
        double deposit = scanner.nextInt();
        scanner.nextLine();
        Customers customer = customerList.get(position);
        double currentBalance = customer.getAccountBalance();
        currentBalance = currentBalance + deposit;
        customer.setAccountBalance(currentBalance);
        customerList.set(position,customer);
        customer.addTransaction(deposit);

        System.out.println(deposit+" was added. "+customer.getName()+"'s new balance is "+customer.getAccountBalance());

        return balance;
    }

    public double withdrawMethod(String custID){
        int position = findCustomers(custID);
        if(position <0){
            System.out.println("No customer was found with that ID, please check.");
            return -1;
        }
        System.out.println("Enter deposit amount: ");
        double withdrawal = scanner.nextInt();
        scanner.nextLine();
        Customers customer = customerList.get(position);
        double currentBalance = customer.getAccountBalance();
        if(withdrawal>=currentBalance){
            currentBalance = currentBalance - withdrawal;
            customer.setAccountBalance(currentBalance);
            customerList.set(position,customer);
            customer.addTransaction(withdrawal);

            System.out.println(withdrawal+" was withdrawn. "+customer.getName()+"'s new balance is "+customer.getAccountBalance());

            return balance;
            }
        System.out.println("Sorry, you cannot withdraw "+withdrawal+" as your current balance of "+currentBalance+" is too low.");
        return -1;

    }


    public Customers findCustomers (Customers customer){
        return customer;
    }

    public int findCustomers(String custID){

        for(int i =0; i<customerList.size(); i++){
            Customers customer = customerList.get(i);
            if (customer.getCustID().equals(custID)){
                return i;
            }
        }return -1;

    }
    public Customers returnCustomer(String custID){
        for(int i =0; i<customerList.size(); i++){
            Customers customer = customerList.get(i);
            if (customer.getCustID().equals(custID)){
                return customer;
            }
        }return null;
    }

    public ArrayList<Customers> getCustomerList() {
        return customerList;
    }

    public String getBranchName() {
        return branchName;
    }
}
