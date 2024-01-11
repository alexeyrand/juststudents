package com.alexeyrand.juststudents.repository;

import com.alexeyrand.juststudents.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
