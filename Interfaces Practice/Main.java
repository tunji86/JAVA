package com.OlatunjiOjuko;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GameClass game1 = new GameClass("Fifa",20);
        System.out.println(game1.toString());
        saveObject(game1);//object of class used were object of interface was declared, all implementing class can be used like this

        game1.setPoints(8);
        System.out.println(game1.toString());
        game1.setName("Fifa 18");
        saveObject(game1);
        loadObject(game1);
        System.out.println(game1);

        ISaveable interfaceObject = new PlayerClass("Player 1",22,"Nigeria");
        System.out.println(interfaceObject);
        saveObject(interfaceObject);
        loadObject(interfaceObject);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
    for(int i=0; i<objectToSave.populate().size(); i++){
        System.out.println("Saving "+objectToSave.populate().get(i)+" to storage device.");
    }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> valuesList = readValues();
        objectToLoad.retrieve(valuesList);
    }



}
