package com.java.siit.concurrency;

public class Buffer {
    private int number = -1;
    private boolean available = false;

    // varianta wait / notify
    public synchronized int get() {
        while (!available) {
            try {
                wait(); // Wait for producer to put a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return number;
    }
    public synchronized void put(int number) {
        while (available) {
            try {
                wait(); // Wait for consumer to take value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        available = true;
        notifyAll();
    }



    // varianta non-synchronized
//    public int get() {
//        return number;
//    }
//    public void put(int number) {
//        this.number = number;
//    }



    // varianta synchronized
//    public synchronized int get() {
//        return number;
//    }
//    public synchronized void put(int number) {
//        this.number = number;
//    }
}