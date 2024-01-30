package ua.kozhukhar.hw2;

public class Task2 {

    public static void main(String[] args) {

        // Задание 2: Найти площадь треугольника
        System.out.println("Задание 2:");
        calculateTriangleArea();
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

}

