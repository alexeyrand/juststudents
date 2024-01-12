package com.alexeyrand.juststudents.dto;

import com.alexeyrand.juststudents.model.StudentEntity;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UniversityDto {
    @NonNull
    private Long id;

    @NonNull
    private String name;

    private List<StudentEntity> students;
}
