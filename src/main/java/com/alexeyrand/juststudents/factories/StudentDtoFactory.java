package com.alexeyrand.juststudents.factories;

import com.alexeyrand.juststudents.dto.StudentDto;
import com.alexeyrand.juststudents.model.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentDtoFactory {

    public StudentDto makeStudentDto(StudentEntity entity) {

        return StudentDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .age(entity.getAge())
                .university_id(entity.getUniversity().getId())
                .build();
    }
}
