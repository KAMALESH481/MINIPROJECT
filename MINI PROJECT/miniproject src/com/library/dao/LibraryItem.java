package com.library.dao;

public abstract class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Abstract method to display details of the library item
    public abstract void displayDetails();
}

