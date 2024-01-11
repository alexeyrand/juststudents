package com.alexeyrand.juststudents.controller;


import com.alexeyrand.juststudents.model.Student;
import com.alexeyrand.juststudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student successfully append";
    }

    @GetMapping("/{email}")
    public Student findStudent(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public String deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
        return "Student successfully deleted";
    }

}
