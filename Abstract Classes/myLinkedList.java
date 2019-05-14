package com.OlatunjiOjuko;

public class myLinkedList implements ListInterface {
    private ListItemsHolder root = null;

    public myLinkedList(ListItemsHolder root) {
        this.root = root;
    }

    @Override
    public ListItemsHolder getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItemsHolder newItem) {
        if(this.root == null){//list is empty
            this.root = newItem;
            return true;
        }
            ListItemsHolder currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison<0){//newItem is greater, move right if possiblle
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{//there is no next, so insertat end of list
                    currentItem.setNext(newItem);//WHY currentItem.
                    newItem.setPrevious(currentItem);//WHY newItem.
                    return true;
                }

            }else if (comparison >0){//newItem is less, insert before
                if(currentItem.previous()!=null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{//the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else{//item exists already
                System.out.println(newItem.getValue()+" is already present, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItemsHolder item) {
        return false;
    }

    @Override
    public void traverse(ListItemsHolder rootItem) {
        if(root == null){
            System.out.println("The list is empty.");
        }else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
        }

        }

    }
}
