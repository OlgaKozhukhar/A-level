package ua.kozhukhar.hw7;

import java.util.Random;

public class Task2 {

    public static class Vector3D {
        private double x, y, z;

        // Конструктор с параметрами в виде списка координат [x, y, z]
        public Vector3D(double[] coordinates) {
            if (coordinates.length != 3) {
                throw new IllegalArgumentException("Вектор должен иметь три координаты");
            }
            this.x = coordinates[0];
            this.y = coordinates[1];
            this.z = coordinates[2];
        }

        // Метод для вычисления длины вектора
        public double length() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        // Метод для вычисления векторного произведения с другим вектором
        public Vector3D crossProduct(Vector3D otherVector) {
            double xResult = y * otherVector.z - z * otherVector.y;
            double yResult = z * otherVector.x - x * otherVector.z;
            double zResult = x * otherVector.y - y * otherVector.x;

            return new Vector3D(new double[]{xResult, yResult, zResult});
        }

        // Метод для вычисления косинуса угла между векторами
        public double cosineAngle(Vector3D otherVector) {
            double dotProduct = x * otherVector.x + y * otherVector.y + z * otherVector.z;
            double lengthProduct = length() * otherVector.length();

            // Избегаем деления на ноль
            if (lengthProduct == 0) {
                throw new ArithmeticException("Длина одного из векторов равна нулю");
            }

            return dotProduct / lengthProduct;
        }

        // Метод для сложения векторов
        public Vector3D add(Vector3D otherVector) {
            return new Vector3D(new double[]{x + otherVector.x, y + otherVector.y, z + otherVector.z});
        }

        // Метод для вычитания векторов
        public Vector3D subtract(Vector3D otherVector) {
            return new Vector3D(new double[]{x - otherVector.x, y - otherVector.y, z - otherVector.z});
        }
    }

    // Статический метод для генерации массива случайных векторов размером N
    public static Vector3D[] generateRandomVectors(int N) {
        Vector3D[] vectors = new Vector3D[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            double[] coordinates = {random.nextDouble(), random.nextDouble(), random.nextDouble()};
            vectors[i] = new Vector3D(coordinates);
        }

        return vectors;
    }

    // Пример использования класса
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(new double[]{1, 2, 3});
        Vector3D vector2 = new Vector3D(new double[]{4, 5, 6});

        // Вычисление длины вектора
        double lengthVector1 = vector1.length();
        System.out.println("Длина вектора vector1: " + lengthVector1);

        // Вычисление векторного произведения
        Vector3D crossProductResult = vector1.crossProduct(vector2);
        System.out.println("Векторное произведение vector1 и vector2: (" + crossProductResult.x + ", " + crossProductResult.y + ", " + crossProductResult.z + ")");

        // Вычисление косинуса угла между векторами
        double cosineAngle = vector1.cosineAngle(vector2);
        System.out.println("Косинус угла между vector1 и vector2: " + cosineAngle);

        // Сложение и вычитание векторов
        Vector3D sumVector = vector1.add(vector2);
        Vector3D diffVector = vector1.subtract(vector2);
        System.out.println("Сумма векторов: (" + sumVector.x + ", " + sumVector.y + ", " + sumVector.z + ")");
        System.out.println("Разность векторов: (" + diffVector.x + ", " + diffVector.y + ", " + diffVector.z + ")");

        // Генерация массива случайных векторов
        int N = 5;
        Vector3D[] randomVectors = Task2.generateRandomVectors(N);
        System.out.println("Массив случайных векторов:");
        for (Vector3D v : randomVectors) {
            System.out.println("(" + v.x + ", " + v.y + ", " + v.z + ")");
        }
    }
}