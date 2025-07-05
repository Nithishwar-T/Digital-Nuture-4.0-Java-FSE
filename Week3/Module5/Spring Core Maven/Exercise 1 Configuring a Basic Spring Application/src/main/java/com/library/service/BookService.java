package com.library.service;

import java.util.List;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Spring's setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public List<Book> listBooks() {
        return bookRepository.getAllBooks();
    }
}
