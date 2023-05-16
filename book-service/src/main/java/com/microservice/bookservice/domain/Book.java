package com.microservice.bookservice.domain;


import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    Long id;
    String name;
    String isbn;
}
