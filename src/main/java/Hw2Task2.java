import java.util.Scanner;

public class Hw2Task2 {

    public static void main(String[] args) {

        // Задание 2: Найти площадь треугольника
        System.out.println("Задание 2:");
        calculateTriangleArea();

        // Задание 3: Определить четность числа
        System.out.println("\nЗадание 3:");
        checkEvenOdd();

        // Задание 4: Вывести меньшее по модулю из трех вещественных чисел
        System.out.println("\nЗадание 4:");
        findMinByModulus();

    }

    // Задание 2: Найти площадь треугольника
    private static void calculateTriangleArea() {
        double xA = 1, yA = 5;
        double xB = 3, yB = 5;
        double xC = 6, yC = 7;

        double area = calculateTriangleArea(xA, yA, xB, yB, xC, yC);
        System.out.println("Площадь треугольника: " + area);
    }

    private static double calculateTriangleArea(double xA, double yA, double xB, double yB, double xC, double yC) {
        double sideAB = calculateDistance(xA, yA, xB, yB);
        double sideBC = calculateDistance(xB, yB, xC, yC);
        double sideCA = calculateDistance(xC, yC, xA, yA);

        double s = (sideAB + sideBC + sideCA) / 2;

        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Задание 3: Определить четность числа
    private static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное.");
        } else {
            System.out.println("Число " + number + " нечетное.");
        }
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

