package ua.kozhukhar.hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 2: Проверка простых чисел в массиве
        System.out.println("\nЗадача 2:");
        int[] array2 = generateRandomArray(1000, 1, 100);
        int primeCount = countPrimes(array2);
        System.out.println("Массив: " + Arrays.toString(array2));
        System.out.println("Количество простых чисел в массиве: " + primeCount);

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


    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int countPrimes(int[] array) {
        int count = 0;

        for (int value : array) {
            if (isPrime(value)) {
                count++;
            }
        }

        return count;
    }
}

