package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contacts> ContactsArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public void printArray(){
        System.out.println("***All Contacts are listed below***");
        for (int i =0; i<ContactsArrayList.size();i++){
            System.out.println(ContactsArrayList.get(i).getName()+" -- "+ContactsArrayList.get(i).getPhoneNumber());
        }
    }


    public void addContact(Contacts contact) {
        if (findContact(contact.getName())>=0){
            System.out.println(contact.getName()+" already exists in the list.");

        }else{
            ContactsArrayList.add(contact);
            System.out.println("New Contact added: "+contact.getName()+" --> Phone number: "+contact.getPhoneNumber());
        }

    }
    //public boolean


    public boolean modifyContacts(Contacts oldContact, Contacts newContact){
        int position = findContact(oldContact);
        int i = 0;

        if (findContact(newContact.getName())>=0){
            System.out.println(newContact.getName()+" exists on the list already. Press 3 and enter new name.");
            return false;

        }else if (position >= 0) {
           // findContact(newContact.getName())
            System.out.println("You are about to modify " + oldContact.getName() + ". Press 1 to confirm or 2 to cancel");
            i = scanner.nextInt();
            if (i == 1) {
                ContactsArrayList.set(position, newContact);
                System.out.println(oldContact.getName() + " has been modified to "+newContact.getName()+" -- "+newContact.getPhoneNumber());
            } else {
                System.out.println("Edit aborted");
            }
        }
        return true;
    }
    private boolean containCheck(String name){
        boolean i = ContactsArrayList.contains(name);
        return i;
    }

    private int positionValue (Contacts contact){
       int position = ContactsArrayList.indexOf(contact);
       return position;
    }


    public void removeContact(Contacts contact){
        int position = findContact(contact);
        int i = 0;
        if (position >= 0) {
            System.out.println("You are about to delete " + contact.getName() + ". Press 1 to confirm or 2 to cancel");
            i = scanner.nextInt();
            if (i == 1) {
                ContactsArrayList.remove(position);
                System.out.println(contact.getName() + " has been deleted.");
            } else {
                System.out.println("Edit aborted");
            }
        }


    }
    public void searchContacts (Contacts contact){
        int position = findContact(contact);
        if (position >= 0){
            System.out.println("Here is your required contact details "+ContactsArrayList.get(position).getName()+" -- "+contact.getPhoneNumber());
        }

    }
    private  int findContact (Contacts contact){
        return ContactsArrayList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.ContactsArrayList.size(); i++) {
            Contacts contact = ContactsArrayList.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contacts contact){//
       if(findContact(contact) >=0){
           return contact.getName();
       }
       return null;
    }
    public Contacts queryContact (String name){
        int position = findContact(name);
        if(position >=0){
            return ContactsArrayList.get(position);
        }
        return null;
    }


}
