package com.alexeyrand.juststudents.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "university")
public class UniversityEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "university")
    @JsonManagedReference
    private List<StudentEntity> students = new ArrayList<>();

    public void addStudent(StudentEntity student) {
        students.add(student);
    }
}
