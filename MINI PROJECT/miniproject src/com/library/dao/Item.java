package com.library.dao;

public class Item {
    private String title;
    private String itemType;

    public Item(String title, String itemType) {
        this.title = title;
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public String getItemType() {
        return itemType;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item Type: " + itemType);
    }
}






