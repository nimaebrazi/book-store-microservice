package com.microservice.authorservice.repository;


import com.github.javafaker.Faker;
import com.microservice.authorservice.domain.Author;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class AuthorRepository {
    private final static List<Author> AUTHORS;

    static {
        Faker faker = new Faker();

        AUTHORS = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            AUTHORS.add(
                    Author.builder()
                            .id((long) i+1)
                            .firstName(faker.name().firstName())
                            .lastName(faker.name().lastName())
                            .birthDate(faker.date().birthday())
                            .bio(faker.yoda().quote())
                            .build()
            );
        }

    }

    public List<Author> findAll() {
        return AUTHORS;
    }

}
