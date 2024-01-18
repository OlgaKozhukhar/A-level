package ua.kozhukhar.hw3;

import java.util.Scanner;

public class HW3Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 2: Удалить пробелы и определить, является ли строка палиндромом
        System.out.println("Задание 2:");
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(inputString);
        System.out.println("Строка без пробелов: " + stringWithoutSpaces);

        if (isPalindrome(stringWithoutSpaces)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
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
}
