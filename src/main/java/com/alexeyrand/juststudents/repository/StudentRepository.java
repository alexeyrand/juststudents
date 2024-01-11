package com.alexeyrand.juststudents.repository;

import com.alexeyrand.juststudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
