package com.library.model;

public class Book {
    private String title;
    private String author;

    public Book() {
        this.title = "Effective Java";
        this.author = "Joshua Bloch";
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}
