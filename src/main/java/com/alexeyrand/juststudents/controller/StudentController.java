package com.alexeyrand.juststudents.controller;


import com.alexeyrand.juststudents.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().firstName("Alexey").lastName("Rand").age(22).email("ada@ffds.ru").build(),
                Student.builder().firstName("Oleg").lastName("FRE").age(24).email("ooooooo@ffds.ru").build(),
                Student.builder().firstName("Maxin").lastName("Protor").age(19).email("max@yandex.ru").build()
        );
    }




}
