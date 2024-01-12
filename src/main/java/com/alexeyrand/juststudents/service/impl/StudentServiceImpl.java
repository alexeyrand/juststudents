package com.alexeyrand.juststudents.service.impl;

import com.alexeyrand.juststudents.model.StudentEntity;
import com.alexeyrand.juststudents.repository.StudentRepository;
import com.alexeyrand.juststudents.repository.UniversityRepository;
import com.alexeyrand.juststudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;
    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(StudentEntity student) {
        studentRepository.save(student);

    }

    @Override
    public StudentEntity findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);
    }
}
