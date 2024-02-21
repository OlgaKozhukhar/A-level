package ua.kozhukhar.Example;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(50);
        integerList.add(100);
        integerList.add(150);
        integerList.add(200);

        List<String> stringList = getValuesGreaterThan100(integerList);

        // Виведення списку зі значеннями, що більші за 100
        System.out.println("Values greater than 100:");
        for (String value : stringList) {
            System.out.println(value);
        }
    }

    public static List<String> getValuesGreaterThan100(List<Integer> integerList) {
        List<String> result = new ArrayList<>();
        for (Integer num : integerList) {
            if (num > 100) {
                result.add(String.valueOf(num));
            }
        }
        return result;
    }
}