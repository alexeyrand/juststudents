package com.alexeyrand.juststudents.repository;

import com.alexeyrand.juststudents.model.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class StudentDAO {
    public List<StudentEntity> STUDENTS = new ArrayList<>();

    public StudentEntity saveStudent(StudentEntity student) {
        STUDENTS.add(student);
        return student;
    }

    public StudentEntity findByEmail(String email) {
        return STUDENTS.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public StudentEntity updateStudent(StudentEntity student) {
        var studentId = IntStream.range(0, STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentId > -1) {
            STUDENTS.set(studentId, student);
            return student;
        }
        return null;
    }

    public List<StudentEntity> findAllStudents() {
        return STUDENTS;
    }

    public void deleteStudent(String email) {
        var student = findByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }
}
