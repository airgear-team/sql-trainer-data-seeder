package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateLessonResponse {
    private Long id;
    private String title;
    private Long moduleId;
    private String moduleTitle;
}
