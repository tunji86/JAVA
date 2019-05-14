package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String name;
    private ArrayList<Branches> branches = new ArrayList<>();
    //Branches branchObject = new Branches("Object");
    Scanner scanner = new Scanner(System.in);




    public Bank(String name) {
        this.name = name;
        this.branches = branches;
    }



    public boolean addBranch(String branchName){
        int position = findBranches(branchName);
        if(position >=0){
            System.out.println("Branch already exists.");
            return false;
        }
        branches.add(new Branches(branchName.toUpperCase()));
        System.out.println(branchName+" has been added to list of branches.");
        return true;
    }
    public void addBranchCustomer(String branchName){
        int branchID = findBranches(branchName);
        if (branchID>=0){
            Branches branchObject = branches.get(branchID);
            //System.out.println("Now enter customer details: ");
            System.out.println("Please enter customer ID ");
            String custID = scanner.nextLine().toUpperCase();
            System.out.println("Please enter Name ");
            String Name = scanner.nextLine().toUpperCase();
            System.out.println("Please enter account number ");
            String accountNumber = scanner.nextLine().toUpperCase();
            System.out.println("Please enter initial deposit ");
            Double initialDeposit = scanner.nextDouble();
            Double accountBalance = initialDeposit;
            Customers newCustomer = Customers.customerConstructor(custID,Name,accountNumber,accountBalance,initialDeposit);
            if(branchObject.addCustomers(newCustomer)){
                System.out.println("Customer "+Name+" has been added successfully. Initial deposit is "+initialDeposit);
            }else{
                System.out.println("Error creating new customer.");
            }
        }else{
            System.out.println("That branch doesn't exist. Please chaeck.");
        }
    }

    public void addCustomerDeposits(String branchName, String customerName) {
        int branchID = findBranches(branchName);
        Branches branchObject = branches.get(branchID);
       // Customers customer = br
        if (branchID >= 0) {
                branchObject.depositMethod(customerName);
        }
    }

    public void addCustomerWithdrawals(String branchName, String customerName) {
        int branchID = findBranches(branchName);
        Branches branchObject = branches.get(branchID);
        // Customers customer = br
        if (branchID >= 0) {
            branchObject.withdrawMethod(customerName);
        }
    }



    public Branches findBranches (Branches branches){
            return branches;
        }

    public int findBranches(String name) {
        for (int i = 0; i < branches.size(); i++) {
            Branches branch = branches.get(i);
            if (branch.getBranchName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    public boolean branchCustomerDeposits(String branchName, boolean showTransactions){
        int branchID = findBranches(branchName);
        Branches branchObject = branches.get(branchID);
        if (branchID>=0) {
            System.out.println("Customer details for "+branchName);

            ArrayList<Customers> branchCustomers = branchObject.getCustomerList();
            for (int i=0; i<branchCustomers.size(); i++){
                System.out.println("Customer "+i+1+" is "+branchCustomers.get(i).getName());
                if(showTransactions){
                    Customers customerObject = branchCustomers.get(i);//object needed to access getTransactions
                    System.out.println("Transactions");
                    ArrayList<Double> customerTransactions = customerObject.getTransactions();
                    for(int j=0; j<customerTransactions.size(); j++){
                        System.out.println("Transaction "+j+1+" is "+customerTransactions.get(j));
                    }
                }

        }return true;
        }else{
            return false;
        }
    }






}
