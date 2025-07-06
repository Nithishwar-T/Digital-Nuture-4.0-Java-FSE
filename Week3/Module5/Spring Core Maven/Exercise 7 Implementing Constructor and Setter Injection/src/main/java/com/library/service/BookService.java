package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {

    private Book book; // Constructor Injection
    private BookRepository bookRepository; // Setter Injection

    // ✅ Constructor for Book
    public BookService(Book book) {
        this.book = book;
    }

    // ✅ Setter for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Book Title (from constructor): " + book.getTitle());

        if (bookRepository != null) {
            System.out.println("Book Title (from repository): " +
                bookRepository.getBook().getTitle());
        } else {
            System.out.println("BookRepository is not set.");
        }
    }
}
