package org.example.service.dataset;

import org.example.dto.CreateDatasetRequest;
import org.example.utils.Constants;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class DatasetSeeder {

    public static void main(String[] args) {
        seedDataset1();
        seedDataset2();
        seedDataset3();
        seedDataset4();
        seedDataset5();
        seedDataset6();
        seedDataset7();
        seedDataset8();
        seedDataset9();
        seedDataset10();
        seedDataset11();
        seedDataset12();

    }

    public static void seedDataset1() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book перший модуль, перший урок, третій крок",
                "INSERT INTO book (title, author, price, amount) VALUES ('Тіні забутих предків', 'Коцюбинський М.М.', 670.99, 3);"
        );
        postDataset(request);
    }

    public static void seedDataset2() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book третій модуль",
                "INSERT INTO book (title, author, price, amount) VALUES\n" +
                        "('Тіні забутих предків', 'Коцюбинський М.М.', 670.99, 3),\n" +
                        "('Intermezzo', 'Коцюбинський М.М.', 540.50, 5),\n" +
                        "('Кайдашева сім’я', 'Нечуй-Левицький І.С.', 460.00, 10),\n" +
                        "('Хмари', 'Нечуй-Левицький І.С.', 799.01, 2),\n" +
                        "('Земля', 'Кобилянська О.Ю.', 650.00, 15);\n"
        );
        postDataset(request);
    }

    public static void seedDataset3() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book третій модуль",
                "INSERT INTO book (title, author, price, amount) VALUES\n" +
                        "('Тіні забутих предків', 'Коцюбинський М.М.', 670.99, 3),\n" +
                        "('Intermezzo', 'Коцюбинський М.М.', 540.50, 5),\n" +
                        "('Кайдашева сім’я', 'Нечуй-Левицький І.С.', 460.00, 10),\n" +
                        "('Хмари', 'Нечуй-Левицький І.С.', 799.01, 2),\n" +
                        "('Земля', 'Кобилянська О.Ю.', 650.00, 15),\n" +
                        "('Нове життя', 'Петренко П.П.', 480.50, 10);\n"
        );
        postDataset(request);
    }

    public static void seedDataset4() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book та supply ",
                "INSERT INTO book (title, author, price, amount) VALUES\n" +
                        "('Тіні забутих предків', 'Коцюбинський М.М.', 670.99, 3),\n" +
                        "('Intermezzo', 'Коцюбинський М.М.', 540.50, 5),\n" +
                        "('Кайдашева сім’я', 'Нечуй-Левицький І.С.', 460.00, 10),\n" +
                        "('Хмари', 'Нечуй-Левицький І.С.', 799.01, 2),\n" +
                        "('Земля', 'Кобилянська О.Ю.', 650.00, 15);\n" +
                "\n" +
                        "INSERT INTO supply (supply_id, title, author, price, amount) VALUES\n" +
                        "(1, 'Кобзар', 'Шевченко Т.Г.', 518.99, 2),\n" +
                        "(2, 'Мої лілії', 'Кобилянська О.Ю.', 570.20, 6),\n" +
                        "(3, 'Intermezzo', 'Коцюбинський М.М.',540.50, 7),\n" +
                        "(4, 'Кайдашева сім’я', 'Нечуй-Левицький І.С.', 360.80, 3);\n"
        );
        postDataset(request);
    }

    public static void seedDataset5() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці book",
                "INSERT INTO book (book_id, title, author, price, amount, buy) VALUES\n" +
                        "(1, 'Тіні забутих предків', 'Коцюбинський М.М.', 670.99, 3, 0),\n" +
                        "(2, 'Intermezzo', 'Коцюбинський М.М.', 540.50, 5, 3),\n" +
                        "(3, 'Кайдашева сім’я', 'Нечуй-Левицький І.С.', 460.00, 10, 8),\n" +
                        "(4, 'Хмари', 'Нечуй-Левицький І.С.', 799.01, 2, 0),\n" +
                        "(5, 'Земля', 'Кобилянська О.Ю.', 650.00, 15, 18);"
        );
        postDataset(request);
    }

    public static void seedDataset6() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці trip",
                "INSERT INTO trip (name, city, per_diem, date_first, date_last) VALUES\n" +
                        "('Бондар П.О.', 'Київ', 700.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'Львів', 450.00, '2020-01-14', '2020-01-27'),\n" +
                        "('Шевченко І.В.', 'Київ', 700.00, '2020-01-23', '2020-01-31'),\n" +
                        "('Мельник Г.Р.', 'Львів', 450.00, '2020-01-12', '2020-02-02'),\n" +
                        "('Ткаченко С.П.', 'Київ', 700.00, '2020-02-01', '2020-02-06'),\n" +
                        "('Бондар П.О.', 'Київ', 700.00, '2020-02-14', '2020-02-22'),\n" +
                        "('Коваль А.С.', 'Київ', 700.00, '2020-02-23', '2020-03-01'),\n" +
                        "('Олійник Т.К.', 'Київ', 700.00, '2020-03-03', '2020-03-06'),\n" +
                        "('Ткаченко С.П.', 'Харків', 450.00, '2020-02-27', '2020-03-12'),\n" +
                        "('Шевченко І.В.', 'Одеса', 700.00, '2020-03-29', '2020-04-05'),\n" +
                        "('Коваль А.С.', 'Київ', 700.00, '2020-04-06', '2020-04-14'),\n" +
                        "('Бондар П.О.', 'Харків', 450.00, '2020-04-18', '2020-05-04'),\n" +
                        "('Олійник Т.К.', 'Дніпро', 450.00, '2020-05-20', '2020-05-31'),\n" +
                        "('Шевченко І.В.', 'Одеса', 700.00, '2020-06-01', '2020-06-03'),\n" +
                        "('Коваль А.С.', 'Одеса', 700.00, '2020-05-28', '2020-06-04'),\n" +
                        "('Кравчук А.Ю.', 'Харків', 450.00, '2020-05-25', '2020-06-04'),\n" +
                        "('Ткаченко С.П.', 'Харків', 450.00, '2020-06-03', '2020-06-12'),\n" +
                        "('Кравчук А.Ю.', 'Дніпро', 450.00, '2020-06-20', '2020-06-26'),\n" +
                        "('Коваль А.С.', 'Львів', 450.00, '2020-07-02', '2020-07-13'),\n" +
                        "('Бондар П.О.', 'Полтава', 450.00, '2020-07-19', '2020-07-25');"
        );
        postDataset(request);
    }


    public static void seedDataset7() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці fine",
                "INSERT INTO fine (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', NULL, '2020-01-12', NULL),\n" +
                        "('Олійник В.Д.', 'AE8923КХ', 'Перевищення швидкості (від 20 до 40)', NULL, '2020-02-01', NULL);"
        );
        postDataset(request);
    }

    public static void seedDataset8() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці traffic_violation",
                "INSERT INTO traffic_violation (violation, sum_fine) VALUES\n" +
                        "('Перевищення швидкості (від 20 до 40)', 500.00),\n" +
                        "('Перевищення швидкості (від 40 до 60)', 1000.00),\n" +
                        "('Проїзд на заборонений сигнал', 1000.00);\n" +

                        "INSERT INTO fine (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', NULL, '2020-01-12', NULL),\n" +
                        "('Олійник В.Д.', 'AE8923КХ', 'Перевищення швидкості (від 20 до 40)', NULL, '2020-02-01', NULL),\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', NULL, '2020-02-14', NULL),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', NULL, '2020-02-23', NULL),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Проїзд на заборонений сигнал', NULL, '2020-03-03', NULL);\n"
        );
        postDataset(request);
    }

    public static void seedDataset9() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці traffic_violation",
                "INSERT INTO traffic_violation (violation, sum_fine) VALUES\n" +
                        "('Перевищення швидкості (від 20 до 40)', 500.00),\n" +
                        "('Перевищення швидкості (від 40 до 60)', 1000.00),\n" +
                        "('Проїзд на заборонений сигнал', 1000.00);\n" +

                        "INSERT INTO fine (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-12', NULL),\n" +
                        "('Олійник В.Д.', 'AE8923КХ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-02-01', NULL),\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 1000.00, '2020-02-14', NULL),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 1000.00, '2020-02-23', NULL),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Проїзд на заборонений сигнал', 1000.00, '2020-03-03', NULL);\n"
        );
        postDataset(request);
    }

    public static void seedDataset10() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиці traffic_violation",
                "INSERT INTO traffic_violation (violation, sum_fine) VALUES\n" +
                        "('Перевищення швидкості (від 20 до 40)', 500.00),\n" +
                        "('Перевищення швидкості (від 40 до 60)', 1000.00),\n" +
                        "('Проїзд на заборонений сигнал', 1000.00);\n" +

                        "INSERT INTO fine (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-12', NULL),\n" +
                        "('Олійник В.Д.', 'AE8923КХ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-02-01', NULL),\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 2000.00, '2020-02-14', NULL),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 2000.00, '2020-02-23', NULL),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Проїзд на заборонений сигнал', 1000.00, '2020-03-03', NULL);\n"
        );
        postDataset(request);
    }



    public static void seedDataset11() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиць traffic_violation, fine та payment",
                "INSERT INTO traffic_violation (violation, sum_fine) VALUES\n" +
                        "('Перевищення швидкості (від 20 до 40)', 500.00),\n" +
                        "('Перевищення швидкості (від 40 до 60)', 1000.00),\n" +
                        "('Проїзд на заборонений сигнал', 1000.00);\n" +

                        "INSERT INTO fine (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-12', NULL),\n" +
                        "('Олійник В.Д.', 'AE8923КХ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-02-01', NULL),\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 2000.00, '2020-02-14', NULL),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 2000.00, '2020-02-23', NULL),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Проїзд на заборонений сигнал', 1000.00, '2020-03-03', NULL);\n" +

                        "INSERT INTO payment (name, number_plate, violation, date_violation, date_payment) VALUES\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', '2020-01-12', '2020-01-22'),\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', '2020-02-14', '2020-03-06'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Проїзд на заборонений сигнал', '2020-03-03', '2020-03-23');\n"
        );
        postDataset(request);
    }

    public static void seedDataset12() {
        CreateDatasetRequest request = new CreateDatasetRequest(
                "Дані для таблиць traffic_violation, fine та payment",
                "INSERT INTO traffic_violation (violation, sum_fine) VALUES\n" +
                        "('Перевищення швидкості (від 20 до 40)', 500.00),\n" +
                        "('Перевищення швидкості (від 40 до 60)', 1000.00),\n" +
                        "('Проїзд на заборонений сигнал', 1000.00);\n" +

                        "INSERT INTO fine (name, number_plate, violation, sum_fine, date_violation, date_payment) VALUES\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 500.00, '2020-01-12', '2020-01-17'),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 1000.00, '2020-01-14', '2020-02-27'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-01-23', '2020-02-23'),\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', 250.00, '2020-01-12', '2020-01-22'),\n" +
                        "('Олійник В.Д.', 'AE8923КХ', 'Перевищення швидкості (від 20 до 40)', 500.00, '2020-02-01', NULL),\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', 2000.00, '2020-02-14', '2020-03-06'),\n" +
                        "('Коваль А.С.', 'ВС4567AB', 'Проїзд на заборонений сигнал', 2000.00, '2020-02-23', NULL),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Проїзд на заборонений сигнал', 500.00, '2020-03-03', '2020-03-23');\n" +

                        "INSERT INTO payment (name, number_plate, violation, date_violation, date_payment) VALUES\n" +
                        "('Мельник І.Г.', 'СЕ7012АН', 'Перевищення швидкості (від 20 до 40)', '2020-01-12', '2020-01-22'),\n" +
                        "('Бондар О.В.', 'АА1234КІ', 'Перевищення швидкості (від 40 до 60)', '2020-02-14', '2020-03-06'),\n" +
                        "('Шевченко П.М.', 'КА8901ІВ', 'Проїзд на заборонений сигнал', '2020-03-03', '2020-03-23');\n"
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
