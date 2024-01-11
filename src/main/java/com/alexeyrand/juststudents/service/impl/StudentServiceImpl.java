package com.alexeyrand.juststudents.service.impl;

import com.alexeyrand.juststudents.model.Student;
import com.alexeyrand.juststudents.repository.StudentDAO;
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
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);

    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);
    }
}
