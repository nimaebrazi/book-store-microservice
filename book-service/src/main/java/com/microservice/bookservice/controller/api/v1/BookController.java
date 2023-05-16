package com.microservice.bookservice.controller.api.v1;


import com.microservice.bookservice.domain.Book;
import com.microservice.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/books")
@RestController("bookControllerV1")
@RequiredArgsConstructor
public class BookController {

    final BookService bookService;

    @GetMapping("")
    public ResponseEntity<List<Book>> bookList(){
        return ResponseEntity.ok(bookService.getBookList());
    }

}
