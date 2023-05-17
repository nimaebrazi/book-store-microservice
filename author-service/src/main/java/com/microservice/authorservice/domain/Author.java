package com.microservice.authorservice.domain;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    Long id;
    String firstName;
    String lastName;
    Date birthDate;
    String bio;

}
