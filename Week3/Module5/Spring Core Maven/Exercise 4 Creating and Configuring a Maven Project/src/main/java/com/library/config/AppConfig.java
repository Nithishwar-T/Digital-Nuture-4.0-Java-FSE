package com.library.config;

import com.library.model.Book;
import com.library.service.LibraryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    public LibraryService libraryService() {
        return new LibraryService(book());
    }
}
