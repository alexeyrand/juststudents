package com.alexeyrand.juststudents.factories;

import com.alexeyrand.juststudents.dto.UniversityDto;
import com.alexeyrand.juststudents.model.UniversityEntity;
import org.springframework.stereotype.Component;

/**
 * University entity -> University dto
 */
@Component
public class UniversityDtoFactory {

    public UniversityDto makeUniversityDto(UniversityEntity entity) {

        return UniversityDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .students(entity.getStudents())
                .build();
    }
}
