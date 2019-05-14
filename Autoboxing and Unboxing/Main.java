package com.OlatunjiOjuko;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Branches branches = new Branches("branch");
   private static Bank banks1 = new Bank("Santander");




    public static void main(String[] args) {
   Customers customer1 = new Customers("111","TJ","3456",100,25);
   Customers customer2 = new Customers("222","Ahmed","9686",300,150);
   Customers customer3;
   customer2 = customer1;
   customer2.setAccountBalance(500);
        System.out.println(customer1.getAccountBalance());

    //Bank banks = new Bank("Santander");
   // banks.addBranch("Magdeburg");
    //banks.addBranch("Halle");

    //addBC();




	//printCustomers();

    }


    private static void printCustomers(){
        Branches.printCustomers();
    }

    private static void addBC(){
        System.out.println("Enter Branch name: ");
        String branchName = scanner.nextLine();
        banks1.addBranchCustomer(branchName);
    }


    private static void addCustomer(){
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
        if(branches.addCustomers(newCustomer)){
            System.out.println("Customer "+Name+" has been added successfully. Initial deposit is "+initialDeposit);
        }else{
            System.out.println("Error creating new customer.");
        }

    }
    private static void addBranch(){
        System.out.println("Enter name of new branch: ");
        String branchName = scanner.nextLine().toUpperCase();
        banks1.addBranch(branchName);

    }






}
