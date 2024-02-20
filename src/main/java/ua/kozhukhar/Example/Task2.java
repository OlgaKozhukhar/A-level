package ua.kozhukhar.Example;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};
        int result = countNonRepeatedElements(array);
        System.out.println("Кількість елементів масиву, що не повторюються: " + result);
    }

    public static int countNonRepeatedElements(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : array) {
            if (frequencyMap.get(num) == 1) {
                count++;
            }
        }

        return count;
    }
}
