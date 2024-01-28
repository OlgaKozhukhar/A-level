package ua.kozhukhar.hw5;

public class Task3 {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2},
                {3, 4,},
        };

        int[][] swappedArray = swapRowsAndColumns(originalArray);

        System.out.println("Изначальный массив:");
        printArray(originalArray);

        // Вывод массива после обмена строк и столбцов
        System.out.println("\nМассив после обмена строк и столбцов:");
        printArray(swappedArray);
    }

    // Метод для обмена строк и столбцов
    public static int[][] swapRowsAndColumns(int[][] originalArray) {
        int n = originalArray.length;
        int[][] swappedArray = new int[n][n];

        // Обмен строк и столбцов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                swappedArray[i][j] = originalArray[j][i];
            }
        }

        return swappedArray;
    }

    // Метод для вывода двумерного массива
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

