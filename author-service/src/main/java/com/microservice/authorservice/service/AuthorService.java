package com.microservice.authorservice.service;


import com.microservice.authorservice.domain.Author;
import com.microservice.authorservice.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    final AuthorRepository authorRepository;

    public List<Author> getAuthorList(){
        return authorRepository.findAll();
    }
}
