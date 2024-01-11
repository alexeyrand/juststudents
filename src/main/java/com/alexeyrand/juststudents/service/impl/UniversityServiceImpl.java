package com.alexeyrand.juststudents.service.impl;

import com.alexeyrand.juststudents.model.University;
import com.alexeyrand.juststudents.repository.UniversityRepository;
import com.alexeyrand.juststudents.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UniversityServiceImpl implements UniversityService {

    private UniversityRepository repository;

    @Override
    public List<University> findAllUniversities() {
        return repository.findAll();
    }

    @Override
    public University saveUniversity(University university) {
        return repository.save(university);
    }

    @Override
    public University findById(Long id) {
        Optional<University> universityOptional = repository.findById(id);
        return universityOptional.orElse(null);
    }

    @Override
    public University updateStudent(University university) {
        return repository.saveAndFlush(university);
    }

    @Override
    public void deleteUniversity(Long id) {
        repository.deleteById(id);
    }
}
