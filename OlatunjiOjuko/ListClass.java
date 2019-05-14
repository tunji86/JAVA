package com.OlatunjiOjuko;

public class ListClass extends ListItemsHolder {
    public ListClass() {
    }


    @Override
    ListItemsHolder next() {
        return this.next;
    }

    @Override
    ListItemsHolder setNext(ListItemsHolder item) {
      this.next = item;
        return this.next;
    }

    @Override
    ListItemsHolder previous() {
        return this.previous;
    }

    @Override
    ListItemsHolder setPrevious(ListItemsHolder item) {
        this.previous = item;
        return this.previous;
    }

    @Override
    int compareTo(ListItemsHolder item) {
        String s = value.toString();
        String j = item.toString();

        int i = s.compareTo(j);
        if(i == 0){
            System.out.println(s+" and "+j+" are equal");
            return i;
        }if(i<0){
            System.out.println(s+" is greater than "+j);
            return i;
        }if(i>0){
            System.out.println(s+" is less than "+j);
            return i;
        }else{
            return -1;
        }
    }
}
