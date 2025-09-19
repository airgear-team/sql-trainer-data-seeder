package org.example.service.dataset;

import org.example.dto.CreateDatasetRequest;
import org.example.utils.Constants;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class DatasetSeeder {

    public static void main(String[] args) {
        seedBookDataset1();
        seedBookDataset2();
        seedBookDataset3();
        seedBookDataset4();
        seedBookDataset5();
        seedBookDataset6();
        seedBookDataset7();
        seedBookDataset8();
        seedBookDataset9();
    }

    public static void seedBookDataset1() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book перший модуль, перший урок, третій крок",
                "insert into book values(1,'Кайдашева сімʼя', 'Нечуй-Левицький І.С.', 320.50, 3);"
        );
        postDataset(request);
    }

    public static void seedBookDataset2() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book другий модуль",
                "INSERT INTO book (title, author, price, amount) VALUES\n" +
                        "('Кайдашева сімʼя',  'Нечуй-Левицький І.С.', 320.50, 3),\n" +
                        "('Тіні забутих предків', 'Коцюбинський М.М.', 410.00, 5),\n" +
                        "('Кобзар', 'Шевченко Т.Г.', 520.00, 10),\n" +
                        "('Маруся', 'Квітка-Основʼяненко Г.Ф.', 300.00, 2),\n" +
                        "('Лісова пісня', 'Леся Українка', 450.00, 7);\n"
        );
        postDataset(request);
    }

    public static void seedBookDataset3() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book та supply ",
                "INSERT INTO books (book_id, title, author, price, amount) VALUES\n" +
                        "(1, 'Кайдашева сімʼя', 'Нечуй-Левицький І.С.', 320.50, 3),\n" +
                        "(2, 'Тіні забутих предків', 'Коцюбинський М.М.', 410.00, 5),\n" +
                        "(3, 'Кобзар', 'Шевченко Т.Г.', 520.00, 10),\n" +
                        "(4, 'Маруся', 'Квітка-Основʼяненко Г.Ф.', 300.00, 2),\n" +
                        "(5, 'Лісова пісня', 'Леся Українка', 450.00, 7);\n" +
                        "\n" +
                        "INSERT INTO supply (supply_id, title, author, price, amount) VALUES\n" +
                        "(1, 'Зачарована Десна', 'Довженко О.П.', 380.00, 2),\n" +
                        "(2, 'Intermezzo', 'Коцюбинський М.М.', 340.20, 6),\n" +
                        "(3, 'Кобзар', 'Шевченко Т.Г.', 520.00, 4),\n" +
                        "(4, 'Лісова пісня', 'Леся Українка', 450.00, 3);\n"
        );
        postDataset(request);
    }

    public static void seedBookDataset4() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book",
                "INSERT INTO books (book_id, title, author, price, amount, buy) VALUES\n" +
                        "(1, 'Кайдашева сімʼя', 'Нечуй-Левицький І.С.', 320.50, 3, 1),\n" +
                        "(2, 'Тіні забутих предків', 'Коцюбинський М.М.', 410.00, 5, 2),\n" +
                        "(3, 'Кобзар', 'Шевченко Т.Г.', 520.00, 10, 7),\n" +
                        "(4, 'Маруся', 'Квітка-Основʼяненко Г.Ф.', 300.00, 2, 0),\n" +
                        "(5, 'Лісова пісня', 'Леся Українка', 450.00, 7, 4);\n"
        );
        postDataset(request);
    }

    public static void seedBookDataset5() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці trip",
                "INSERT INTO trip (name, city, per_diem, date_first, date_last) VALUES\n" +
                        "('Бондар О.В.', 'Київ', 700.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'Львів', 450.00, '2020-01-14', '2020-01-20'),\n" +
                        "('Шевченко П.М.', 'Харків', 600.00, '2020-01-23', '2020-01-31'),\n" +
                        "('Мельник І.Г.', 'Одеса', 500.00, '2020-02-01', '2020-02-06'),\n" +
                        "('Ткаченко Р.Д.', 'Дніпро', 550.00, '2020-02-14', '2020-02-22'),\n" +
                        "('Коваль А.С.', 'Івано-Франківськ', 480.00, '2020-03-01', '2020-03-06');"
        );
        postDataset(request);
    }

    public static void seedBookDataset6() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці fine",
                "INSERT INTO fines (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567ЛТ', 'Проїзд на заборонний сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СН3456ОР', 'Перевищення швидкості (від 20 до 40)', NULL, '2020-02-01', NULL);\n"
        );
        postDataset(request);
    }

    public static void seedBookDataset7() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці traffic_violation",
                "INSERT INTO traffic_violation (violation, sum_fine) VALUES\n" +
                        "('Перевищення швидкості (від 20 до 40)', 500.00),\n" +
                        "('Перевищення швидкості (від 40 до 60)', 1000.00),\n" +
                        "('Проїзд на заборонний сигнал', 1000.00);\n" +
                        "INSERT INTO fine (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567ЛТ', 'Проїзд на заборонний сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23');\n"
        );
        postDataset(request);
    }

    public static void seedBookDataset8() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці з апдейтами",
                "INSERT INTO your_table_name (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567ЛТ', 'Проїзд на заборонний сигнал', 2000.00, '2020-02-23', NULL);\n"
        );
        postDataset(request);
    }

    public static void seedBookDataset9() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці з апдейтами",
                "INSERT INTO your_table_name (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СН3456ОР', 'Перевищення швидкості (від 20 до 40)', 250.00, '2020-01-12', '2020-01-22');\n"
        );
        postDataset(request);
    }

    private static void postDataset(CreateDatasetRequest request) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<CreateDatasetRequest> entity = new HttpEntity<>(request, headers);
            ResponseEntity<String> response = restTemplate.postForEntity(Constants.URL + "/datasets", entity, String.class);

            System.out.println("Response Code: " + response.getStatusCodeValue());
            System.out.println("Response Body: " + response.getBody());
        } catch (Exception e) {
            System.err.println("Failed to send dataset request: " + request.getTitle());
            e.printStackTrace();
        }
    }
}
