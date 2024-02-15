public class Task5 {
    public static void main(String[] args) {
        int number = 2;
        int power = 1;
        System.out.println(power(number,power));

    }

    public static int power(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }
}
