package ua.kozhukhar.hw15;

import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

    public class Task1 {
        public static void main(String[] args) throws Exception {
            // Получаем конструктор класса A
            Constructor<A> constructor = A.class.getDeclaredConstructor();
            // Разрешаем доступ к приватному конструктору
            constructor.setAccessible(true);
            // Создаем экземпляр класса A
            A instance = constructor.newInstance();

            // Изменяем значения переменных через рефлексию
            Field idField = A.class.getDeclaredField("id");
            Field nameField = A.class.getDeclaredField("name");
            idField.setAccessible(true);
            nameField.setAccessible(true);
            idField.set(instance, "456");
            nameField.set(instance, "B");

            // Выводим измененный объект
            System.out.println(instance);
        }

        static class A {
            private String id = "123";
            private String name = "A";

            private A() {
            }

            @Override
            public String toString() {
                return "A{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
    }


