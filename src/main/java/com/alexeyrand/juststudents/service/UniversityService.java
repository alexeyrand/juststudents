package com.alexeyrand.juststudents.service;

import com.alexeyrand.juststudents.dto.UniversityDto;
import com.alexeyrand.juststudents.model.UniversityEntity;

import java.util.List;

public interface UniversityService {
    List<UniversityEntity> findAllUniversities();
    UniversityEntity saveUniversity(UniversityEntity university);
    UniversityEntity findById(Long id);
    UniversityEntity updateStudent(UniversityEntity university);
    void deleteUniversity(Long id);
}
