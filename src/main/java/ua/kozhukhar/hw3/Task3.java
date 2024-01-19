package ua.kozhukhar.hw3;

import java.util.Scanner;

public class HW3Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 3: Подсчитать количество слов в строке
        System.out.println("\nЗадание 3:");
        System.out.print("Введите строку с словами: ");
        String wordsString = scanner.nextLine();

        int wordCount = countWords(wordsString);
        System.out.println("Количество слов в строке: " + wordCount);

    }

    // Метод для удаления пробелов из строки
    private static String removeSpaces(String input) {
        return input.replaceAll("\\s", "");
    }

    // Метод для определения, является ли строка палиндромом
    private static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // Метод для подсчета количества слов в строке
    private static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
