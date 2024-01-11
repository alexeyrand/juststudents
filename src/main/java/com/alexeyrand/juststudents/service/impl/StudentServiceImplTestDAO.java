package com.alexeyrand.juststudents.service.impl;

import com.alexeyrand.juststudents.model.Student;
import com.alexeyrand.juststudents.repository.StudentDAO;
import com.alexeyrand.juststudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImplTestDAO implements StudentService {

    private StudentDAO repository;


    @Override
    public void saveStudent(Student student) {
        repository.saveStudent(student);

    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
