package ua.kozhukhar.hw1;

public class HWTask4 {

    public static void main(String[] args) {
        // Задание 4: Вывести меньшее по модулю из трех вещественных чисел
        System.out.println("\nЗадание 4:");
        findMinByModulus();
    }

    // Задание 4: Вывести меньшее по модулю из трех вещественных чисел
    private static void findMinByModulus() {
        double num1 = -5;
        double num2 = 7;
        double num3 = 11;

        double minByModulus = findMinByModulus(num1, num2, num3);
        System.out.println("Минимальное по модулю число: " + minByModulus);
    }
    private static double findMinByModulus(double num1, double num2, double num3) {
        double mod1 = Math.abs(num1);
        double mod2 = Math.abs(num2);
        double mod3 = Math.abs(num3);

        return Math.min(Math.min(mod1, mod2), mod3);
    }
}
