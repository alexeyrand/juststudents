package com.alexeyrand.juststudents.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "students")
public class StudentEntity {
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
    @JsonBackReference
    private UniversityEntity university;

}
