package org.example.service.schema;

import org.example.dto.CreateDbSchemaRequest;
import org.example.utils.Constants;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class SchemaSeeder {


    public static void main(String[] args) {
        seedSchema1();
        seedSchema2();
        seedSchema3();
        seedSchema4();
        seedSchema5();
        seedSchema6();
        seedSchema7();

    }

    public static void seedSchema1() {
        CreateDbSchemaRequest request = new CreateDbSchemaRequest(
                "Схема таблиці book",
                "CREATE TABLE book (" +
                        "book_id INT PRIMARY KEY AUTO_INCREMENT, " +
                        "title VARCHAR(55), " +
                        "author VARCHAR(30), " +
                        "amount INT, " +
                        "price DECIMAL(8, 2)" +
                        ");"
        );
        postSchema(request);
    }

    public static void seedSchema2() {
        CreateDbSchemaRequest request = new CreateDbSchemaRequest(
                "Схема таблиці supply",
                "create table supply (" +
                        "supply_id INT primary KEY AUTO_INCREMENT," +
                        "title VARCHAR (50)," +
                        "author VARCHAR(30)," +
                        "price DECIMAL(8,2)," +
                        "amount INT)"
        );
        postSchema(request);
    }

    public static void seedSchema3() {
        CreateDbSchemaRequest request = new CreateDbSchemaRequest(
                "Схема таблиці supply та book",
                "CREATE TABLE book (\n" +
                        "    book_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    title VARCHAR(255) NOT NULL,\n" +
                        "    author VARCHAR(255) NOT NULL,\n" +
                        "    price DECIMAL(10,2) NOT NULL,\n" +
                        "    amount INT NOT NULL\n" +
                        ");\n" +
                        "\n" +
                        "CREATE TABLE supply (\n" +
                        "    supply_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    title VARCHAR(255) NOT NULL,\n" +
                        "    author VARCHAR(255) NOT NULL,\n" +
                        "    price DECIMAL(10,2) NOT NULL,\n" +
                        "    amount INT NOT NULL\n" +
                        ");\n"
        );
        postSchema(request);
    }

    public static void seedSchema4() {
        CreateDbSchemaRequest request = new CreateDbSchemaRequest(
                "Схема таблиці book з полем buy",
                "CREATE TABLE book (\n" +
                        "    book_id INT PRIMARY KEY,\n" +
                        "    title VARCHAR(255) NOT NULL,\n" +
                        "    author VARCHAR(255) NOT NULL,\n" +
                        "    price DECIMAL(10, 2) NOT NULL,\n" +
                        "    amount INT NOT NULL,\n" +
                        "    buy INT NOT NULL\n" +
                        ");\n"
        );
        postSchema(request);
    }


    public static void seedSchema5() {
        CreateDbSchemaRequest request = new CreateDbSchemaRequest(
                "Схема таблиці trip",
                "CREATE TABLE trip (\n" +
                        "    trip_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    name VARCHAR(50) NOT NULL,\n" +
                        "    city VARCHAR(50) NOT NULL,\n" +
                        "    per_diem DECIMAL(8, 2) NOT NULL,\n" +
                        "    date_first DATE NOT NULL,\n" +
                        "    date_last DATE NOT NULL\n" +
                        ");"
        );
        postSchema(request);
    }

    public static void seedSchema6() {
        CreateDbSchemaRequest request = new CreateDbSchemaRequest(
                "Схема таблиці fine та traffic_violation ",
                "CREATE TABLE traffic_violation (\n" +
                        "    violation_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    violation VARCHAR(255) NOT NULL,\n" +
                        "    sum_fine DECIMAL(10,2) NOT NULL\n" +
                        ");\n" +
                        "\n" +
                        "CREATE TABLE fine (\n" +
                        "    fine_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    name VARCHAR(50) NOT NULL,\n" +
                        "    number_plate VARCHAR(10) NOT NULL,\n" +
                        "    violation VARCHAR(255) NOT NULL,\n" +
                        "    sum_fine DECIMAL(10,2) NULL,\n" +
                        "    date_violation DATE NOT NULL,\n" +
                        "    date_payment DATE NULL\n" +
                        ");\n"
        );
        postSchema(request);
    }


    public static void seedSchema7() {
        CreateDbSchemaRequest request = new CreateDbSchemaRequest(
                "Схема таблиці fine, traffic_violation та payment",
                "CREATE TABLE traffic_violation (\n" +
                        "    violation_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    violation VARCHAR(255) NOT NULL,\n" +
                        "    sum_fine DECIMAL(10,2) NOT NULL\n" +
                        ");\n" +
                        "\n" +
                        "CREATE TABLE fine (\n" +
                        "    fine_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    name VARCHAR(50) NOT NULL,\n" +
                        "    number_plate VARCHAR(10) NOT NULL,\n" +
                        "    violation VARCHAR(255) NOT NULL,\n" +
                        "    sum_fine DECIMAL(10,2) NULL,\n" +
                        "    date_violation DATE NOT NULL,\n" +
                        "    date_payment DATE NULL\n" +
                        ");\n" +
                        "\n" +
                        "CREATE TABLE payment (\n" +
                        "    payment_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    name VARCHAR(50) NOT NULL,\n" +
                        "    number_plate VARCHAR(10) NOT NULL,\n" +
                        "    violation VARCHAR(255) NOT NULL,\n" +
                        "    date_violation DATE NOT NULL,\n" +
                        "    date_payment DATE NOT NULL\n" +
                        ");\n"
        );
        postSchema(request);
    }


    private static void postSchema(CreateDbSchemaRequest request) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<CreateDbSchemaRequest> entity = new HttpEntity<>(request, headers);
            ResponseEntity<String> response = restTemplate.postForEntity(Constants.URL + "/schemas", entity, String.class);

            System.out.println("Response Code: " + response.getStatusCodeValue());
            System.out.println("Response Body: " + response.getBody());
        } catch (Exception e) {
            System.err.println("Failed to send schema request: " + request.getTitle());
            e.printStackTrace();
        }
    }
}