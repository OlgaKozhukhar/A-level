package ua.kozhukhar.hw5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Заполнение двумерного массива
        System.out.println("\nЗадача 1:");
        int[][] numbers = {{1, 2, 3},
                {-4, -5, -6},
                {7, 8, 9},
                {-10, -11, -12}};

        // Вывод двумерного массива
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; i++) {
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println(numbers);
        }
    }
}
