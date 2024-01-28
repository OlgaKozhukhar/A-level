public class Example {
    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 0;
        int x3 = -11;
        System.out.println("x = " + x1 + ";y = " + calc(x1));
        System.out.println("x = " + x2 + ";y = " + calc(x2));
        System.out.println("x = " + x3 + ";y = " + calc(x3));
    }

    public static double calc(double x) {
        double y;
        if (x > 0) {
            y = x - 2;
        } else if (x == 0) {
            y = 0;
        } else {
            y = Math.abs(x);
        }
        return y;
    }
}
//Вывести нечетное число
//Задача
//Из двух чисел с разной четностью вывести на экран нечетное число.



