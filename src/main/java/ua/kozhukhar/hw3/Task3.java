package ua.kozhukhar.hw3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 3: Подсчитать количество слов в строке
        System.out.println("\nЗадание 3:");
        System.out.println("Введите строку с словами: ");
        String wordsString = scanner.nextLine();

        int wordCount = countWords(wordsString);
        System.out.println("Количество слов в строке: " + wordCount);

    }

    // Метод для подсчета количества слов в строке
    private static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
