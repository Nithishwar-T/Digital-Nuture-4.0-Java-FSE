package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.model.Book;
import com.library.service.BookService;

public class MainApp {

    public static void main(String[] args) {
        // Load Spring context XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Add books
        bookService.addBook(new Book("1984", "George Orwell"));
        bookService.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        // List books
        System.out.println("Books in the library:");
        for (Book book : bookService.listBooks()) {
            System.out.println(book);
        }

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
