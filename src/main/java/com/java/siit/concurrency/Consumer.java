package com.java.siit.concurrency;

public class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer b) {
        buffer = b;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = buffer.get();
            System.out.println("Consumatorul a primit:" + Thread.currentThread().getName() + value);
//            try {
//                // simuleaza un timp mai mare de procesare
//                sleep((int)(Math.random() * 100));
//            } catch (InterruptedException e) { }
        }
    }
}