package com.OlatunjiOjuko;

public class bankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double deposit;
    private double withdrawal;

    //We can set default values for our objects when using constructors in case no value is yet entered in our objects. As done below...
    public bankAccount(){
        this(00000001, 0.0, "Unnamed Customer", "Unknown email","Unknown phone number");
    }

    //Below is the CONSTRUCTOR declaration. We set values to it in the Main class to create multiple objects.
    public bankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){

        this.accountNumber = accountNumber;
        this.balance= balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void setAccountNumber(int accountNumber){
        int accNumLimit = accountNumber;
        if (accNumLimit > 0 && accNumLimit <= 99999999){
            this.accountNumber=accountNumber;

        } else {
            System.out.println("Account number cannot be longer than 8 digits!");
            this.accountNumber=0;
        }

    }
    public void setBalance(double balance){

        this.balance=balance;

    }
    public  void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public  void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public  void setDeposit(double deposit){
        double newDeposit = deposit;
        balance = balance+newDeposit;

    }
    public  void setWithdrawal(double withdrawal){
        double newWithdrawal = withdrawal;
        if(balance >= withdrawal){
            this.balance = balance-withdrawal;
            System.out.println("You have withdrawn "+withdrawal+" ,balance after withdrawal is now "+balance);
        }else {
            System.out.println("You have insufficient funds, your current balance is "+balance);
        }
    }
    //************************************************************************************************************************

    //getMethods will return values, unlike setMethods, so must be declared with specific data types
    public int getAccountNumber(){
        System.out.println("Account number is "+accountNumber);
        return this.accountNumber=accountNumber;
    }
    public  double getBalance(){
        System.out.println(customerName+"'s account balance is "+balance);
        return this.balance=balance;
    }
    public String getCustomerName(){
        return this.customerName=customerName;
    }
    public  String getEmail(){
        return this.email=email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber=phoneNumber;
    }

    public double getDeposit(){
        System.out.println("You deposited "+deposit+" and your new balance is now "+balance);
        return deposit;

    }
    public double getWithdrawal(){

        return withdrawal;
    }

}
