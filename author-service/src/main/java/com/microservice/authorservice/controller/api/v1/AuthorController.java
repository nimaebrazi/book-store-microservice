package com.microservice.authorservice.controller.api.v1;


import com.microservice.authorservice.domain.Author;
import com.microservice.authorservice.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/authors")
@RestController("authorControllerV1")
@RequiredArgsConstructor
public class AuthorController {

    final AuthorService authorService;

    @GetMapping("")
    public ResponseEntity<List<Author>> authorList(){
        return ResponseEntity.ok(authorService.getAuthorList());
    }
}
