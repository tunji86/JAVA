package com.OlatunjiOjuko;

public class Main {

    public static void main(String[] args) {
    myLinkedList list = new myLinkedList(null);
    list.traverse(list.getRoot());
        //string data array to help add multiple strings quickly
	String stringDate = "Ogun Lagos Osun Ekiti Oyo Imo Abuja Delta Kebbi Kano Anambra";

	String[] data = stringDate.split(" ");
	for (String s: data){
        list.addItem(new ListClass(s) {
        });
    }


    }
}
