package com.ebube.dailyAlgorithms;

class Demonstration {
    public static void main(String args[]) throws InterruptedException {
        Threads.runTest();
    }
}

public class Threads {
    long startRange;
    long endRange;
    long counter = 0;
    static long MAX_NUM = Integer.MAX_VALUE;

    public Threads(long startRange, long endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public void add() {
        for (long i = startRange; i <= endRange; i++) {
            counter += i;
        }
    }


    static public void fourThreads() throws InterruptedException {
        long start = System.currentTimeMillis();
        Threads s1 = new Threads(1, MAX_NUM / 4);
        Threads s2 = new Threads(1 + (MAX_NUM / 4), MAX_NUM / 2);
        Threads s3 = new Threads(1 + (MAX_NUM / 2), 3 * MAX_NUM / 4);
        Threads s4 = new Threads(1 + (3 * MAX_NUM / 4), MAX_NUM);

        Thread t1 = new Thread(() -> s1.add());
        Thread t2 = new Thread(() -> s2.add());
        Thread t3 = new Thread(() -> s3.add());
        Thread t4 = new Thread(() -> s4.add());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long finalCount = s1.counter + s2.counter + s3.counter + s4.counter;
        long end = System.currentTimeMillis();
        System.out.println("Four threads final count = " + finalCount + " took " + (end - start));
    }

    static public void oneThread() {
        long start = System.currentTimeMillis();
        Threads s = new Threads(1, MAX_NUM);
        s.add();
        long end = System.currentTimeMillis();
        System.out.println("Single thread final count = " + s.counter + " took " + (end - start));
    }

    public static void runTest() throws InterruptedException {
        oneThread();
        fourThreads();
    }

    int counter1 = 0;

    void incrementCounter() {
        counter++;
    }
}
