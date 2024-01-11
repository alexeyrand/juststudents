package com.alexeyrand.juststudents.controller;


import com.alexeyrand.juststudents.model.Student;
import com.alexeyrand.juststudents.model.University;
import com.alexeyrand.juststudents.service.StudentService;
import com.alexeyrand.juststudents.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;
    private final UniversityService universityService;

    public static final String GET_ALL_STUDENTS = "/universities/students";
    public static final String GET_STUDENTS_FROM_UNIVERSITY = "/universities/{university_id}/students";
    public static final String GET_STUDENT = "/universities/{university_id}/students/{student_email}";
    public static final String POST_STUDENT = "/universities/{university_id}/students";

    @GetMapping(GET_ALL_STUDENTS)
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping(POST_STUDENT)
    public String saveStudent(@RequestBody Student student, @PathVariable(name = "university_id") Long university_id) {
        University university = universityService.findById(university_id);
        student.setUniversity(university);
        studentService.saveStudent(student);
        return "Student successfully append";
    }

    @GetMapping("/{email}")
    public Student findStudent(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public String deleteStudent(@PathVariable String email) {
        studentService.deleteStudent(email);
        return "Student successfully deleted";
    }

}
