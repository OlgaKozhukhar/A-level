package ua.kozhukhar.hw5;

public class Task2 {
    public static void main(String[] args) {
        // Пример использования метода
        int[] array = {15, 10, 7, 4};
        boolean isSortedDescending = isDescending(array);
        System.out.println("Массив упорядочен по убыванию: " + isSortedDescending);
    }

       public static boolean isDescending(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

}
