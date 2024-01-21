package ua.kozhukhar.hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Задача 3: Замена четных значений на ноль
        System.out.println("\nЗадача 3:");
        int[] array3 = generateRandomArray(2000, 2, 50);
        int[] modifiedArray = replaceEvenWithZero(array3);
        System.out.println("Исходный массив: " + Arrays.toString(array3));
        System.out.println("Массив с замененными четными значениями: " + Arrays.toString(modifiedArray));

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


    private static int[] replaceEvenWithZero(int[] array) {
        int[] modifiedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < modifiedArray.length; i++) {
            if (modifiedArray[i] % 2 == 0) {
                modifiedArray[i] = 0;
            }
        }

        return modifiedArray;
    }
}

