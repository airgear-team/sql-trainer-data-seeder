package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateStepRequest {

    private String description;
    private String expectedQuery;
    private Long schemaId;
    private Long datasetId;
    private Long lessonId;
    private OperationType operationType;
    private Integer orderIndex;
    public StepType stepType;

}