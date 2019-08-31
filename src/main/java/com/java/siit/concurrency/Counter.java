package com.java.siit.concurrency;

public class Counter {
    private int count = 0;

    public int getCount() {
        synchronized (this) {
            return count;
        }
        // alt cod care nu necesita sincronizare
    }

    public void increment() {
        synchronized (this) {
            count++;
        }
        // alt cod care nu necesita sincronizare

    }
}
