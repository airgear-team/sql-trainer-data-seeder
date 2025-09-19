package org.example.service.lesson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dto.CreateLessonRequest;
import org.example.utils.Constants;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class LessonSeeder {


    public static void main(String[] args) {
        createLessonsModule1();
    }


    public static void createLessonsModule1(){

        List<String> lessonTitles = List.of(
                "1.1 Відношення (таблиця)",
                "1.2 Вибір даних",
                "1.3 Запити, групові операції",
                "1.4 Вкладені запити",
                "1.5 Запити коригування даних",
                "1.6 Таблиця \"Відрядження\", запити на вибірку",
                "1.7 Таблиця \"Порушення правил дорожнього руху\", запити коригування"
        );
        createLessons(lessonTitles);
    }




    public static void createLessons(List<String> lessonTitles){
        RestTemplate restTemplate = new RestTemplate();

        for (String title : lessonTitles) {
            CreateLessonRequest request = new CreateLessonRequest(title, 1L);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<CreateLessonRequest> entity = new HttpEntity<>(request, headers);

            try {
                restTemplate.postForEntity(Constants.URL + "/lessons", entity, Void.class);
                System.out.println("Урок створено: " + title);
            } catch (Exception e) {
                System.out.println("Помилка при створенні уроку \"" + title + "\": " + e.getMessage());
            }
        }
    }
}
