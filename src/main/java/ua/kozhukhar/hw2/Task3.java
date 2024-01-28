package ua.kozhukhar.hw2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        // Задание 3: Определить четность числа
        System.out.println("\nЗадание 3:");
        checkEvenOdd();
    }

    // Задание 3: Определить четность числа
    private static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное.");
        } else {
            System.out.println("Число " + number + " нечетное.");
        }
    }
}
