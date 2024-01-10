package com.alexeyrand.juststudents.model;


import lombok.*;

import java.time.Instant;
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
    @Builder.Default
    private LocalDate dateOfBirth = LocalDate.now();

    private String email;
    private int age;


}
