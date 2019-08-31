package com.java.siit.concurrency;

public class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 100; i = i + 3) {
            System.out.println("Current thread is:" + Thread.currentThread().getName() + " current number is: + " + i);
        }

    }
}