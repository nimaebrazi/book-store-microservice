package com.microservice.bookservice.repository;


import com.microservice.bookservice.domain.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {

    private final static List<Book> books;

    static {
        books = new ArrayList<>();
        books.add(Book.builder().id(1L).name("AWS in Action").isbn("978-9-6889-7302-8").build());
        books.add(Book.builder().id(2L).name("Spring Boot in Action").isbn("978-1-8615-5096-5").build());
        books.add(Book.builder().id(3L).name("Spring Boot in Action").isbn("978-0-5361-3410-3").build());
    }

    public List<Book> findAll(){
        return books;
    }

}
