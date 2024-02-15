package ua.kozhukhar.hw11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static Map<String, Integer> countStringLengths(List<String> strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : strings) {
            resultMap.put(str, str.length());
        }
        return resultMap;
    }

    public static void main(String[] args) {
        List<String> inputStrings = List.of("тут", "там", "стол");
        Map<String, Integer> result = countStringLengths(inputStrings);
        System.out.println(result);
    }
}

