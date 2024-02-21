package ua.kozhukhar.hw14;

class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("Hello from thread " + threadNumber);
    }
}

public class Task1 {
    public void startThreads() {
        Thread[] threads = new Thread[50];
        for (int i = 49; i >= 0; i--) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        try {
            for (int i = 49; i >= 0; i--) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Task1 main = new Task1();
        main.startThreads();
    }
}
