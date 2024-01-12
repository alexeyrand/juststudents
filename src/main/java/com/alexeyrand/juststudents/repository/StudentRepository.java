package com.alexeyrand.juststudents.repository;

import com.alexeyrand.juststudents.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    StudentEntity findByEmail(String email);
    void deleteByEmail(String email);
}
