package ua.kozhukhar.hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Среднее арифметическое и геометрическое
        System.out.println("Задача 1:");
        int[] array1 = generateRandomArray(400, 1, 10);
        double averageArithmetic = calculateAverageArithmetic(array1);
        double averageGeometric = calculateAverageGeometric(array1);
        System.out.println("Массив: " + Arrays.toString(array1));
        System.out.println("Среднее арифметическое: " + averageArithmetic);
        System.out.println("Среднее геометрическое: " + averageGeometric);

                scanner.close();
    }

    private static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    private static double calculateAverageArithmetic(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    private static double calculateAverageGeometric(int[] array) {
        double product = 1;

        for (int value : array) {
            product *= value;
        }

        return Math.pow(product, 1.0 / array.length);
    }

}
