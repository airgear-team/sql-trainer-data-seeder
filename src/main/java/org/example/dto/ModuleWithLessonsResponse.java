package org.example.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModuleWithLessonsResponse {
    private Long id;
    private String title;
    private List<ShortLessonResponse> lessons;
}
