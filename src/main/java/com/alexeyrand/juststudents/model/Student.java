package com.alexeyrand.juststudents.model;


import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private String email;
    private int age;


}
