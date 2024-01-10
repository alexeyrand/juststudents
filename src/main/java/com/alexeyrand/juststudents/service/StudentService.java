package com.alexeyrand.juststudents.service;

import com.alexeyrand.juststudents.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
