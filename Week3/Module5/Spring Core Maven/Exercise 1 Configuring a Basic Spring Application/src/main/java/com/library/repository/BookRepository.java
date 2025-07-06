package com.library.repository;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
