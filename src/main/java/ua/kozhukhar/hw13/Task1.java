package ua.kozhukhar.hw13;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Task1 {

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("src/main/java/ua/kozhukhar/hw13/box.json"));

            String from = (String) jsonObject.get("from");
            String material = (String) jsonObject.get("material");
            String color = (String) jsonObject.get("color");

            JSONObject maxLiftingCapacityObject = (JSONObject) jsonObject.get("max-lifting-capacity");
            String unit = (String) maxLiftingCapacityObject.get("unit");
            long value = (long) maxLiftingCapacityObject.get("value");
            MaxLiftingCapacity maxLiftingCapacity = new MaxLiftingCapacity(unit, (int) value);

            JSONObject cargoObject = (JSONObject) jsonObject.get("cargo");
            String cargoName = (String) cargoObject.get("name");
            String cargoClass = (String) cargoObject.get("class");
            Cargo cargo = new Cargo(cargoName, cargoClass);

            String deliveryDateStr = (String) jsonObject.get("delivery-date");
            LocalDateTime deliveryDate = LocalDateTime.parse(deliveryDateStr, DateTimeFormatter.ISO_DATE_TIME);

            Box box = new Box(from, material, color, maxLiftingCapacity, cargo, deliveryDate);

            // Вывод информации о коробке
            System.out.println("Box created with details: " + box);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



