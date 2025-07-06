package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // ✅ Setter method for Spring to inject
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        Book book = bookRepository.getBook();
        System.out.println("Book Title: " + book.getTitle());
    }
}
