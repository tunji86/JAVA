package com.OlatunjiOjuko;



public interface ListInterface {
    ListItemsHolder getRoot();
    boolean addItem(ListItemsHolder newItem);
    boolean removeItem(ListItemsHolder item);
    void traverse(ListItemsHolder rootItem);
}
