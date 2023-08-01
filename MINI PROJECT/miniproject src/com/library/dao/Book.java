package com.library.dao;
public class Book extends Item {
    private String author;
    private int pages;

    public Book(String title, String itemType, String author, int pages) {
        super(title, itemType);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}