package ua.kozhukhar.hw10;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {


        public static void main(String[] args) {
            // Создаем ArrayList и добавляем элементы
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            // Обход ArrayList с использованием цикла for
            System.out.println("Обход с использованием цикла for:");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }

            // Обход ArrayList с использованием for-each
            System.out.println("\nОбход с использованием for-each:");
            for (int number : numbers) {
                System.out.println(number);
            }

            // Обход ArrayList с использованием while
            System.out.println("\nОбход с использованием while:");
            int index = 0;
            while (index < numbers.size()) {
                System.out.println(numbers.get(index));
                index++;
            }

            // Обход ArrayList с использованием итератора
            System.out.println("\nОбход с использованием итератора:");
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

