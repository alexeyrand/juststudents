package com.alexeyrand.juststudents.service.impl;

import com.alexeyrand.juststudents.factories.UniversityDtoFactory;
import com.alexeyrand.juststudents.model.UniversityEntity;
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
    private UniversityDtoFactory universityDtoFactory;

    @Override
    public List<UniversityEntity> findAllUniversities() {
        return repository.findAll();
    }

    @Override
    public UniversityEntity saveUniversity(UniversityEntity university) {
        return repository.save(university);
    }

    @Override
    public UniversityEntity findById(Long id) {
        Optional<UniversityEntity> universityOptional = repository.findById(id);
        return universityOptional.orElse(null);

    }

    @Override
    public UniversityEntity updateStudent(UniversityEntity university) {
        return repository.saveAndFlush(university);
    }

    @Override
    public void deleteUniversity(Long id) {
        repository.deleteById(id);
    }
}
