package org.example.service.module;

import org.example.dto.CreateModuleRequest;
import org.example.utils.Constants;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ModuleSeeder {


    public static void main(String[] args) {
        module1();
        module2();
    }

    public static void module1() {
        postModule(new CreateModuleRequest("1 Основи реляційної моделі та SQL"));
    }

    public static void module2() {
        postModule(new CreateModuleRequest("2 Запити SQL до зв'язаних таблиць"));
    }

    private static void postModule(CreateModuleRequest request) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<CreateModuleRequest> entity = new HttpEntity<>(request, headers);

            ResponseEntity<String> response = restTemplate.postForEntity(Constants.URL + "/modules", entity, String.class);

            System.out.println("Response Code: " + response.getStatusCodeValue());
            System.out.println("Response Body: " + response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
