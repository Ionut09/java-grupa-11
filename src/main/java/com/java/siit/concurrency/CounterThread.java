package com.java.siit.concurrency;

public class CounterThread extends Thread {

    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            System.out.println(counter.getCount());

        }
    }
}
