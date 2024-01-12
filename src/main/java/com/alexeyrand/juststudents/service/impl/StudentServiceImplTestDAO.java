package com.alexeyrand.juststudents.service.impl;

import com.alexeyrand.juststudents.model.StudentEntity;
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
    public void saveStudent(StudentEntity student) {
        repository.saveStudent(student);

    }

    @Override
    public StudentEntity findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return repository.updateStudent(student);
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
