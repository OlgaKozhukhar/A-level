package ua.kozhukhar.hw14;

public class PrimeCounterThread extends Thread {
    private int[] numbers;
    private int count;

    public PrimeCounterThread(int[] numbers) {
        this.numbers = numbers;
        this.count = 0;
    }

    public void run() {
        for (int num : numbers) {
            if (isPrime(num)) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

