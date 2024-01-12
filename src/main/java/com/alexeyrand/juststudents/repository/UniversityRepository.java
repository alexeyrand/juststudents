package com.alexeyrand.juststudents.repository;

import com.alexeyrand.juststudents.model.UniversityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<UniversityEntity, Long> {
}
