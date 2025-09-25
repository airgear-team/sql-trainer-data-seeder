package org.example.service.step;

import org.example.dto.CreateStepRequest;
import org.example.dto.OperationType;
import org.example.dto.StepType;
import org.example.utils.Constants;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.nio.file.Files;
import java.nio.file.Paths;

public class StepSeeder {

    private static final String RESOURCES_PATH_CONTEXT = "X:\\Work\\sql-trainer-data-seeder\\src\\main\\resources\\";

    public static void main(String[] args) {
//          seedStep1_1_0();
//        seedStep1_1_1();
//        seedStep1_1_2();
//        seedStep1_1_3();

//        seedStep1_2_0();
//        seedStep1_2_1();
//        seedStep1_2_2();
//        seedStep1_2_3();
//        seedStep1_2_4();
//        seedStep1_2_5();
//        seedStep1_2_6();
//        seedStep1_2_7();
//        seedStep1_2_8();
//        seedStep1_2_9();
//        seedStep1_2_10();
//        seedStep1_2_11();

//        seedStep1_3_1();
//        seedStep1_3_2();
//        seedStep1_3_3();
//        seedStep1_3_4();
//        seedStep1_3_5();
//        seedStep1_3_6();
//        seedStep1_3_7();

//        seedStep1_4_1();
//        seedStep1_4_2();
//        seedStep1_4_3();
//        seedStep1_4_4();
//        seedStep1_4_5();

//        seedStep1_5_1();
//        seedStep1_5_2();
//        seedStep1_5_3();
//        seedStep1_5_4();
//        seedStep1_5_5();
//        seedStep1_5_6();
//        seedStep1_5_7();
//        seedStep1_5_8();
//        seedStep1_5_9();
//
//        seedStep1_6_1();
//        seedStep1_6_2();
//        seedStep1_6_3();
//        seedStep1_6_4();
//        seedStep1_6_5();
//        seedStep1_6_6();
//        seedStep1_6_7();
//        seedStep1_6_8();
//        seedStep1_6_9();

//        seedStep1_7_1();
//        seedStep1_7_2();
//        seedStep1_7_3();
//        seedStep1_7_4();
//        seedStep1_7_5();
//        seedStep1_7_6();
//        seedStep1_7_7();
    }

    public static void seedStep1_1_0() {
        createStep(
                1L,
                null,
                null,
                "html\\1\\1\\step0.html",
                null,
                null,
                1,
                StepType.THEORY
                );
    }

    public static void seedStep1_1_1() {
        createStep(
                1L,
                null,
                null,
                "html\\1\\1\\step1.html",
                "sql\\1\\1\\expected1.txt",
                OperationType.CREATE,
                2,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_1_2() {
        createStep(
                1L,
                1L,
                null,
                "html\\1\\1\\step2.html",
                "sql\\1\\1\\expected2.txt",
                OperationType.INSERT,
                3,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_1_3() {
        createStep(
                1L,
                1L,
                1L,
                "html\\1\\1\\step3.html",
                "sql\\1\\1\\expected3.txt",
                OperationType.INSERT,
                4,
                StepType.PRACTICE
        );
    }














    public static void seedStep1_2_0() {
        createStep(
                2L,
                null,
                null,
                "html\\1\\2\\step0.html",
                null,
                null,
                1,
                StepType.THEORY
        );
    }

    public static void seedStep1_2_1() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step1.html",
                "sql\\1\\2\\expected1.txt",
                OperationType.SELECT,
                2,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_2_2() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step2.html",
                "sql\\1\\2\\expected2.txt",
                OperationType.SELECT,
                3,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_3() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step3.html",
                "sql\\1\\2\\expected3.txt",
                OperationType.SELECT,
                4,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_4() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step4.html",
                "sql\\1\\2\\expected4.txt",
                OperationType.SELECT,
                5,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_5() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step5.html",
                "sql\\1\\2\\expected5.txt",
                OperationType.SELECT,
                6,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_6() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step6.html",
                "sql\\1\\2\\expected6.txt",
                OperationType.SELECT,
                7,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_7() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step7.html",
                "sql\\1\\2\\expected7.txt",
                OperationType.SELECT,
                8,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_8() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step8.html",
                "sql\\1\\2\\expected8.txt",
                OperationType.SELECT,
                9,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_9() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step9.html",
                "sql\\1\\2\\expected9.txt",
                OperationType.SELECT,
                10,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_10() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step10.html",
                "sql\\1\\2\\expected10.txt",
                OperationType.SELECT,
                11,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_11() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step11.html",
                "sql\\1\\2\\expected11.txt",
                OperationType.SELECT,
                12,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_2_12() {
        createStep(
                2L,
                1L,
                2L,
                "html\\1\\2\\step12.html",
                null,
                OperationType.SELECT,
                13,
                StepType.CREATIVE
        );
    }










    public static void seedStep1_3_0() {
        createStep(
                3L,
                null,
                null,
                "html\\1\\3\\step0.html",
                null,
                null,
                1,
                StepType.THEORY
        );
    }

    public static void seedStep1_3_1() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step1.html",
                "sql\\1\\3\\expected1.txt",
                OperationType.SELECT,
                2,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_3_2() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step2.html",
                "sql\\1\\3\\expected2.txt",
                OperationType.SELECT,
                3,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_3_3() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step3.html",
                "sql\\1\\3\\expected3.txt",
                OperationType.SELECT,
                4,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_3_4() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step4.html",
                "sql\\1\\3\\expected4.txt",
                OperationType.SELECT,
                5,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_3_5() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step5.html",
                "sql\\1\\3\\expected5.txt",
                OperationType.SELECT,
                6,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_3_6() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step6.html",
                "sql\\1\\3\\expected6.txt",
                OperationType.SELECT,
                7,
                StepType.PRACTICE
        );
    }
    public static void seedStep1_3_7() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step7.html",
                "sql\\1\\3\\expected7.txt",
                OperationType.SELECT,
                8,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_3_8() {
        createStep(
                3L,
                1L,
                2L,
                "html\\1\\3\\step8.html",
                null,
                OperationType.SELECT,
                9,
                StepType.CREATIVE
        );
    }









    public static void seedStep1_4_0() {
        createStep(
                4L,
                null,
                null,
                "html\\1\\4\\step0.html",
                null,
                null,
                1,
                StepType.THEORY
        );
    }

    public static void seedStep1_4_1() {
        createStep(
                4L,
                1L,
                3L,
                "html\\1\\4\\step1.html",
                "sql\\1\\4\\expected1.txt",
                OperationType.SELECT,
                2,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_4_2() {
        createStep(
                4L,
                1L,
                3L,
                "html\\1\\4\\step2.html",
                "sql\\1\\4\\expected2.txt",
                OperationType.SELECT,
                3,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_4_3() {
        createStep(
                4L,
                1L,
                3L,
                "html\\1\\4\\step3.html",
                "sql\\1\\4\\expected3.txt",
                OperationType.SELECT,
                4,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_4_4() {
        createStep(
                4L,
                1L,
                3L,
                "html\\1\\4\\step4.html",
                "sql\\1\\4\\expected4.txt",
                OperationType.SELECT,
                5,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_4_5() {
        createStep(
                4L,
                1L,
                3L,
                "html\\1\\4\\step5.html",
                "sql\\1\\4\\expected5.txt",
                OperationType.SELECT,
                6,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_4_6() {
        createStep(
                4L,
                1L,
                3L,
                "html\\1\\4\\step6.html",
                null,
                OperationType.SELECT,
                7,
                StepType.CREATIVE
        );
    }




    public static void seedStep1_5_0() {
        createStep(
                5L,
                null,
                null,
                "html\\1\\5\\step0.html",
                null,
                null,
                1,
                StepType.THEORY
        );
    }

    public static void seedStep1_5_1() {
        createStep(
                5L,
                null,
                null,
                "html\\1\\5\\step1.html",
                "sql\\1\\5\\expected1.txt",
                OperationType.CREATE,
                2,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_2() {
        createStep(
                5L,
                2L,
                null,
                "html\\1\\5\\step2.html",
                "sql\\1\\5\\expected2.txt",
                OperationType.INSERT,
                3,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_3() {
        createStep(
                5L,
                3L,
                4L,
                "html\\1\\5\\step3.html",
                "sql\\1\\5\\expected3.txt",
                OperationType.INSERT,
                4,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_4() {
        createStep(
                5L,
                3L,
                4L,
                "html\\1\\5\\step4.html",
                "sql\\1\\5\\expected4.txt",
                OperationType.INSERT,
                5,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_5() {
        createStep(
                5L,
                3L,
                4L,
                "html\\1\\5\\step5.html",
                "sql\\1\\5\\expected5.txt",
                OperationType.UPDATE,
                6,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_6() {
        createStep(
                5L,
                4L,
                5L,
                "html\\1\\5\\step6.html",
                "sql\\1\\5\\expected6.txt",
                OperationType.CREATE,
                7,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_7() {
        createStep(
                5L,
                3L,
                4L,
                "html\\1\\5\\step7.html",
                "sql\\1\\5\\expected7.txt",
                OperationType.UPDATE,
                8,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_8() {
        createStep(
                5L,
                3L,
                4L,
                "html\\1\\5\\step8.html",
                "sql\\1\\5\\expected8.txt",
                OperationType.DELETE,
                9,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_9() {
        createStep(
                5L,
                3L,
                4L,
                "html\\1\\5\\step9.html",
                "sql\\1\\5\\expected9.txt",
                OperationType.CREATE,
                10,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_5_10() {
        createStep(
                5L,
                3L,
                4L,
                "html\\1\\5\\step10.html",
                null,
                OperationType.SELECT,
                11,
                StepType.CREATIVE
        );
    }










    public static void seedStep1_6_0() {
        createStep(
                6L,
                null,
                null,
                "html\\1\\6\\step0.html",
                null,
                null,
                1,
                StepType.THEORY
        );
    }

    public static void seedStep1_6_1() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step1.html",
                "sql\\1\\6\\expected1.txt",
                OperationType.SELECT,
                2,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_2() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step2.html",
                "sql\\1\\6\\expected2.txt",
                OperationType.SELECT,
                3,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_3() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step3.html",
                "sql\\1\\6\\expected3.txt",
                OperationType.SELECT,
                4,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_4() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step4.html",
                "sql\\1\\6\\expected4.txt",
                OperationType.SELECT,
                5,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_5() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step5.html",
                "sql\\1\\6\\expected5.txt",
                OperationType.SELECT,
                6,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_6() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step6.html",
                "sql\\1\\6\\expected6.txt",
                OperationType.SELECT,
                7,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_7() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step7.html",
                "sql\\1\\6\\expected7.txt",
                OperationType.SELECT,
                8,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_8() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step8.html",
                "sql\\1\\6\\expected8.txt",
                OperationType.SELECT,
                9,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_9() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step9.html",
                "sql\\1\\6\\expected9.txt",
                OperationType.SELECT,
                10,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_6_10() {
        createStep(
                6L,
                5L,
                6L,
                "html\\1\\6\\step10.html",
                "sql\\1\\6\\expected10.txt",
                OperationType.SELECT,
                11,
                StepType.PRACTICE
        );
    }









    public static void seedStep1_7_0() {
        createStep(
                7L,
                null,
                null,
                "html\\1\\7\\step0.html",
                null,
                null,
                1,
                StepType.THEORY
        );
    }

    public static void seedStep1_7_1() {
        createStep(
                7L,
                null,
                null,
                "html\\1\\7\\step1.html",
                "sql\\1\\7\\expected1.txt",
                OperationType.CREATE,
                2,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_7_2() {
        createStep(
                7L,
                6L,
                7L,
                "html\\1\\7\\step2.html",
                "sql\\1\\7\\expected2.txt",
                OperationType.INSERT,
                3,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_7_3() {
        createStep(
                7L,
                6L,
                8L,
                "html\\1\\7\\step3.html",
                "sql\\1\\7\\expected3.txt",
                OperationType.UPDATE,
                4,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_7_4() {
        createStep(
                7L,
                6L,
                9L,
                "html\\1\\7\\step4.html",
                "sql\\1\\7\\expected4.txt",
                OperationType.SELECT,
                5,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_7_5() {
        createStep(
                7L,
                7L,
                9L,
                "html\\1\\7\\step5.html",
                "sql\\1\\7\\expected5.txt",
                OperationType.UPDATE,
                6,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_7_6() {
        createStep(
                7L,
                7L,
                11L,
                "html\\1\\7\\step6.html",
                "sql\\1\\7\\expected6.txt",
                OperationType.CREATE,
                7,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_7_7() {
        createStep(
                7L,
                7L,
                12L,
                "html\\1\\7\\step7.html",
                "sql\\1\\7\\expected7.txt",
                OperationType.DELETE,
                8,
                StepType.PRACTICE
        );
    }

    public static void seedStep1_7_8() {
        createStep(
                7L,
                7L,
                12L,
                "html\\1\\7\\step8.html",
                "sql\\1\\7\\expected8.txt",
                OperationType.SELECT,
                9,
                StepType.PRACTICE
        );
    }


    private static void createStep(Long lessonId,
                                   Long schemaId,
                                   Long datasetId,
                                   String descriptionFilePath,
                                   String expectedQueryFilePath,
                                   OperationType operationType,
                                   Integer orderIndex,
                                   StepType stepType
) {
        try {
            String description = Files.readString(Paths.get(RESOURCES_PATH_CONTEXT + descriptionFilePath));
            String expectedQuery = "";
            if(expectedQueryFilePath!=null){
                expectedQuery = Files.readString(Paths.get(RESOURCES_PATH_CONTEXT + expectedQueryFilePath));
            }

            CreateStepRequest request = new CreateStepRequest(
                    description,
                    expectedQuery,
                    schemaId,
                    datasetId,
                    lessonId,
                    operationType,
                    orderIndex,
                    stepType
            );

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<CreateStepRequest> entity = new HttpEntity<>(request, headers);
            ResponseEntity<String> response = restTemplate.postForEntity(Constants.URL + "/steps", entity, String.class);

            System.out.println("Response Code: " + response.getStatusCodeValue());
            System.out.println("Response Body: " + response.getBody());
        } catch (Exception e) {
            System.err.println("Failed to send request for lessonId = " + lessonId);
            e.printStackTrace();
        }
    }
}
