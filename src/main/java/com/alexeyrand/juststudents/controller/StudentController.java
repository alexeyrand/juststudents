package com.alexeyrand.juststudents.controller;


import com.alexeyrand.juststudents.dto.StudentDto;
import com.alexeyrand.juststudents.factories.StudentDtoFactory;
import com.alexeyrand.juststudents.model.StudentEntity;
import com.alexeyrand.juststudents.model.UniversityEntity;
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
    private final StudentDtoFactory studentDtoFactory;

    private final UniversityService universityService;



    public static final String GET_ALL_STUDENTS = "/universities/students";
    public static final String GET_STUDENTS_FROM_UNIVERSITY = "/universities/{university_id}/students";
    public static final String GET_STUDENT = "/universities/{university_id}/students/{student_email}";
    public static final String POST_STUDENT = "/universities/{university_id}/students";

    @GetMapping(GET_ALL_STUDENTS)
    public List<StudentEntity> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping(POST_STUDENT)
    public StudentDto saveStudent(@RequestBody StudentEntity student, @PathVariable(name = "university_id") Long university_id) {
        UniversityEntity university = universityService.findById(university_id);
        student.setUniversity(university);
        //university.addStudent(student);
        studentService.saveStudent(student);
        return studentDtoFactory.makeStudentDto(student);
    }

    @GetMapping("/{email}")
    public StudentEntity findStudent(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    @PutMapping
    public StudentEntity updateStudent(@RequestBody StudentEntity student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public String deleteStudent(@PathVariable String email) {
        studentService.deleteStudent(email);
        return "Student successfully deleted";
    }

}
