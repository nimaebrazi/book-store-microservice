package com.microservice.bookservice.service;


import com.microservice.bookservice.domain.Book;
import com.microservice.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    final BookRepository bookRepository;

    public List<Book> getBookList(){
        return bookRepository.findAll();
    }

}
