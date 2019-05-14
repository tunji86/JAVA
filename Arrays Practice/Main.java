package com.OlatunjiOjuko;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrayValues = getIntegers(5);

        printArray(arrayValues);

        sortIntegers(arrayValues);


    }


    public static int[] getIntegers (int number){
        int[] array = new int[number];

        System.out.println("Enter "+number+" values please!");

        for(int i=0; i<array.length; i++){
            array[i] = scan.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Value "+i+" is "+array[i]);
        }
    }

    public static void sortIntegers(int[] array){
        Arrays.sort(array);
        for (int i=0; i<array.length; i++){
            System.out.println("The integers sorted, are: "+i+" is "+array[i]);
        }

    }


}
