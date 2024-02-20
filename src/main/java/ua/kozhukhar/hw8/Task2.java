package ua.kozhukhar.hw8;
@FunctionalInterface
interface Pow {
    int pow(int number, int exponent);
}
    public class Task2 {

        public static void main(String[] args) {
            // Реализация интерфейса с использованием лямбда-выражения
            Pow powFunction = (number, exponent) -> {
                int result = 1;

                // Возводим число в степень
                for (int i = 0; i < exponent; i++) {
                    result *= number;
                }

                return result;
            };

            // Пример использования функции
            int result = powFunction.pow(1, 2);
            System.out.println("1 в степени 2 равно " + result);


        }
    }

