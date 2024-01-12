package com.alexeyrand.juststudents.service;

import com.alexeyrand.juststudents.model.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> findAllStudents();
    void saveStudent(StudentEntity student);
    StudentEntity findByEmail(String email);
    StudentEntity updateStudent(StudentEntity student);
    void deleteStudent(String email);
}
