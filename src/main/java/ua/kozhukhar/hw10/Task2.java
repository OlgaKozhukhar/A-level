package ua.kozhukhar.hw10;

import java.util.ArrayList;
import java.util.List;

    public class Task2 {

        // Метод для получения суммы элементов списка
        public static int getSum(List<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }

        // Метод для получения нового списка нечетных чисел
        public static List<Integer> getOddNumber(List<Integer> numbers) {
            List<Integer> oddNumbers = new ArrayList<>();
            for (int num : numbers) {
                if (num % 2 != 0) {
                    oddNumbers.add(num);
                }
            }
            return oddNumbers;
        }

        // Метод для преобразования списка чисел в список строк
        public static List<String> convertToStringList(List<Integer> numbers) {
            List<String> stringList = new ArrayList<>();
            for (int num : numbers) {
                stringList.add(String.valueOf(num));
            }
            return stringList;
        }

        // Метод для дублирования и конкатенации строк в новом списке
        public static List<String> doubling(List<String> strings) {
            List<String> doubledStrings = new ArrayList<>();
            for (String str : strings) {
                doubledStrings.add(str + str);
            }
            return doubledStrings;
        }

        // Пример использования
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);

            System.out.println("Сумма элементов списка: " + getSum(numbers));

            List<Integer> oddNumbers = getOddNumber(numbers);
            System.out.println("Нечетные числа: " + oddNumbers);

            List<String> stringList = convertToStringList(numbers);
            System.out.println("Список строк: " + stringList);

            List<String> doubledStrings = doubling(stringList);
            System.out.println("Дублированные строки: " + doubledStrings);
        }
    }
