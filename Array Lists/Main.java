package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // private static Contacts contact = new Contacts(scanner.nextLine(),scanner.nextLine());
    private static MobilePhone mobilePhoneObject = new MobilePhone();
    // private static ArrayList<Contacts> ListInMain = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("HERZLICH WILKOMMEN");
        printInstructions();

        boolean y = false;

        while (!y) {
            int i = scanner.nextInt();
            scanner.nextLine();

            switch (i) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    print();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    query();
                    break;
                case 6:
                    quitLoop();
                    y = true;
                    break;

            }

        }

    }

    public static void printInstructions() {
        System.out.println("**************MENU***************");
        System.out.println("Select 1 to print Contact list");
        System.out.println("Select 2 add a new contact to list");
        System.out.println("Select 3 to modify a contact");
        System.out.println("Select 4 to remove a contact from list");
        System.out.println("Select 5 to search for a contact from list");
        System.out.println("Select 6 to exit");
    }

    public static void print() {
        mobilePhoneObject.printArray();
    }

    public static void add() {
        System.out.println("Please enter name ");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("Please enter number ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.contactConstructor(name, phoneNumber);
        mobilePhoneObject.addContact(newContact);
        System.out.println("Press 0 for main menu");
    }

    public static void modify() {
        System.out.println("Please enter name of contact you wish to modify ");
        String name = scanner.nextLine().toLowerCase();
        Contacts oldContact = mobilePhoneObject.queryContact(name);
        if (oldContact == null) {
            System.out.println(name + " was not found in contact list. Please check to confirm");
        } else {
            System.out.println("Please add new name ");
            String newName = scanner.nextLine();
            System.out.println("Please enter new number ");
            String newNumber = scanner.nextLine();
            Contacts newContact = Contacts.contactConstructor(newName, newNumber);
            mobilePhoneObject.modifyContacts(oldContact, newContact);

        }


        //mobilePhoneObject.modifyContacts();

    }

    public static void remove() {
        System.out.println("Please enter name of contact you wish to delete ");
        String name = scanner.nextLine().toLowerCase();
        Contacts contact = mobilePhoneObject.queryContact(name);
        if (contact == null) {
            System.out.println(name + " was not found on contact list. Please check for confirmation");
            return;
        }
        mobilePhoneObject.removeContact(contact);


    }

    public static void query() {
        System.out.println("Please enter name of contact ");
        String name = scanner.nextLine().toLowerCase();
        Contacts contact = mobilePhoneObject.queryContact(name);
        if (contact == null) {
            System.out.println("Contact was not found, please check spellings.");
            return;
        }
        mobilePhoneObject.searchContacts(contact);

    }

    public static void quitLoop() {
        System.out.println("You have exited the program. Thank you.");
    }


}
