package com.OlatunjiOjuko;

import java.util.LinkedList;
import java.util.ListIterator;

public abstract class ListItemsHolder {
    protected ListItemsHolder next = null;
    protected ListItemsHolder previous = null;

    protected Object value;

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItemsHolder next();
    abstract ListItemsHolder setNext(ListItemsHolder item);
    abstract ListItemsHolder previous();
    abstract ListItemsHolder setPrevious(ListItemsHolder item);

    abstract int compareTo(ListItemsHolder item);

    public Object getValue() {
        return value;
    }

    /*public void skipForward(LinkedList<String> anyList){
        ListIterator<String> myListIterator = anyList.listIterator();
        boolean forward = true;

        if(!forward){
            if(myListIterator.hasNext()){
                myListIterator.next();
            }
        }if(myListIterator.hasNext()){
            System.out.println("Next song is "+myListIterator.next());
        }else{
            System.out.println("You have reached end of the list");
        }
    }*/

    /*public void skipBackward(LinkedList<String> anyList){
        ListIterator<String> myListIterator = anyList.listIterator();
        boolean forward = true;

        if(forward){
            if(myListIterator.hasPrevious()){
                myListIterator.previous();
            }
        }if(myListIterator.hasPrevious()){
            System.out.println("Previous song is "+myListIterator.previous());
        }else{
            System.out.println("You are at the top of the list");
        }
    }*/

    /*public void setNextItem(LinkedList<ListItemsHolder> anylist, ListItemsHolder value){
        ListIterator<ListItemsHolder> myListIterator = anylist.listIterator();

        while(myListIterator.hasNext()){
            int testString = myListIterator.next().compareMethod(value);
            if(testString ==0){
                System.out.println(value+" exists in list already.");
            }
            if(testString<0){
                myListIterator.next();
            }if(testString>0){
            myListIterator.previous();
            myListIterator.set(value);
                System.out.println(value+" is added to the list.");
            }else{
                myListIterator.set(value);
                System.out.println(value+" is added to the list.");
            }

        }

    }*/

    /*public int compareMethod (ListItemsHolder compareValue){
        String s = value.toString();
        String j = compareValue.toString();

       int i = s.compareTo(j);
       if(i == 0){
           System.out.println(s+" and "+j+" are equal");

       }if(i<0){
            System.out.println(s+" is greater than "+j);

        }if(i>0){
            System.out.println(s+" is less than "+j);

        }return i;

        }*/
    }


