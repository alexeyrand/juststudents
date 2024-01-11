package com.alexeyrand.juststudents.controller;

import com.alexeyrand.juststudents.model.University;
import com.alexeyrand.juststudents.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class UniversityController {

    private final UniversityService service;

    public static final String GET_UNIVERSITIES = "/universities";
    public static final String GET_UNIVERSITY = "/universities/{university_id}";
    public static final String POST_UNIVERSITY = "/universities";

    @GetMapping(GET_UNIVERSITIES)
    public List<University> findAll() {
        return service.findAllUniversities();
    }

    @GetMapping(GET_UNIVERSITY)
    public University findById(@PathVariable Long university_id) {
        return service.findById(university_id);
    }

    @PostMapping(POST_UNIVERSITY)
    public String saveUniversity(@RequestBody University university) {
        service.saveUniversity(university);
        return "University successfully append";
    }


}
