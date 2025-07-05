package com.library.service;

import com.library.model.Book;

public class LibraryService {

    private Book book;

    public LibraryService(Book book) {
        this.book = book;
    }

    public void issueBook() {
        System.out.println("Issuing book...");
        book.displayInfo();
    }
}
