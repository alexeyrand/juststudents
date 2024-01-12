package com.alexeyrand.juststudents.controller;

import com.alexeyrand.juststudents.dto.UniversityDto;
import com.alexeyrand.juststudents.factories.UniversityDtoFactory;
import com.alexeyrand.juststudents.model.UniversityEntity;
import com.alexeyrand.juststudents.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class UniversityController {

    private final UniversityService service;
    private final UniversityDtoFactory universityDtoFactory;

    public static final String GET_UNIVERSITIES = "/universities";
    public static final String GET_UNIVERSITY = "/universities/{university_id}";
    public static final String POST_UNIVERSITY = "/universities";

    @GetMapping(GET_UNIVERSITIES)
    public List<UniversityEntity> findAll() {
        return service.findAllUniversities();
    }

    @GetMapping(GET_UNIVERSITY)
    public UniversityDto findById(@PathVariable Long university_id) {
        UniversityEntity universityEntity = service.findById(university_id);
        return universityDtoFactory.makeUniversityDto(universityEntity);
    }

    @PostMapping(POST_UNIVERSITY)
    public UniversityDto saveUniversity(@RequestBody UniversityEntity university) {
        UniversityEntity universityEntity = service.saveUniversity(university);
        return universityDtoFactory.makeUniversityDto(universityEntity);
    }


}
