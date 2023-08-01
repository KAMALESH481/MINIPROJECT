package com.library.dao;

public class DVD extends LibraryItem {
    private String director;

    public DVD(String title, String director) {
        super(title);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Type: DVD");
        // Additional DVD-specific details can be displayed here
    }
}
