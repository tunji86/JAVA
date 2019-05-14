package com.OlatunjiOjuko;

public class Contacts {
    private  String name;
    private  String phoneNumber;


    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //method below used to create new contacts instances
    public static Contacts contactConstructor (String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
