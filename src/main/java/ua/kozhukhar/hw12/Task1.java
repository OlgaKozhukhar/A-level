package ua.kozhukhar.hw12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"))) {

            while (true) {
                String line = scanner.nextLine();

                if (line.equals("end")) {
                    break;
                } else if (line.equals("next")) {
                    writer.newLine();
                } else {
                    writer.write(line);
                    writer.write(",");
                }
            }

            System.out.println("CSV файл успешно создан.");

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}
