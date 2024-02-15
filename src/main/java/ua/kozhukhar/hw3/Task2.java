package ua.kozhukhar.hw3;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 2: Определить, является ли строка палиндромом
        System.out.println("Задание 2:");
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        String stringWithoutSpaces = inputString.replaceAll("\\s", "");
        System.out.println("Строка без пробелов: " + stringWithoutSpaces);

        if (isPalindrome(stringWithoutSpaces)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }

    // Метод для определения, является ли строка палиндромом
    private static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
}
