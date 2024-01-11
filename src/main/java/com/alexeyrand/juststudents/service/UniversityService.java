package com.alexeyrand.juststudents.service;

import com.alexeyrand.juststudents.model.Student;
import com.alexeyrand.juststudents.model.University;

import java.util.List;

public interface UniversityService {
    List<University> findAllUniversities();
    University saveUniversity(University university);
    University findById(Long id);
    University updateStudent(University university);
    void deleteUniversity(Long id);
}
