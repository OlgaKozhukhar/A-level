package ua.kozhukhar.hw14;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] firstHalf = new int[numbers.length / 2];
        int[] secondHalf = new int[numbers.length - numbers.length / 2];
        System.arraycopy(numbers, 0, firstHalf, 0, numbers.length / 2);
        System.arraycopy(numbers, numbers.length / 2, secondHalf, 0, numbers.length - numbers.length / 2);

        PrimeCounterThread thread1 = new PrimeCounterThread(firstHalf);
        PrimeCounterThread thread2 = new PrimeCounterThread(secondHalf);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalCount = thread1.getCount() + thread2.getCount();
        System.out.println("Total prime numbers: " + totalCount);
    }
}

