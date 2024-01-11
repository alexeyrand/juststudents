package com.alexeyrand.juststudents.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Builder.Default
    private LocalDate dateOfBirth = LocalDate.now();
    @Column(unique = true)
    private String email;
    private int age;
    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

}
