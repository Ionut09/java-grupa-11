package com.java.siit.concurrency;

public class ConcurrencyMain {

    private static void countNumbersWithSleep() {
        Thread myThread = new Thread(() -> {
            for (int i = 1; i <= 600000; i++) {
//               System.out.println("Current nr is: " + i);
                if (i % 10 == 0) {
                    System.out.println("Current nr is: " + i);
                }
//               try {
//                   Thread.sleep(100);
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }
            }
        });

        myThread.start();
    }

    private static void execise3theads() {
        // myThread extends class Thread
        MyThread myThread = new MyThread();
        // myRunnable implements interface Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread threadWithRunnable = new Thread(myRunnable);
        // using lambda expression to create the body for run() method
        Thread myThread2 = new Thread(() -> {
            for (int i = 1; i <= 100; i= i + 5) {
                System.out.println("Current thread is:" + Thread.currentThread().getName() + " current number is: + " + i);
            }
        });

        myThread.setName("myThread");
        threadWithRunnable.setName("threadWithRunnable");
        myThread2.setName("myThread2");

        myThread.start();
        threadWithRunnable.start();
        myThread2.start();
    }

    private static void exerciseCounterModifiedByMultipleThreads() {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);


        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
    }

    private static void exerciseOneThread() throws InterruptedException {

        System.out.println("main");
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
//        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();

        System.out.println("main again");

        // ceva de lucru pentru main
        for (int i = 1111; i <= 1200; i++) {
            System.out.println("thread is:" + Thread.currentThread().getName() + i);
        }
    }

    private static void exerciseProducerConsumer2ThreadsEach() {

        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Producer producer2 = new Producer(buffer);

        Consumer consumer = new Consumer(buffer);
        consumer.setName("consumer  ");
        Consumer consumer2 = new Consumer(buffer);
        consumer2.setName("consumer2  ");

        producer.start();
        producer2.start();
        consumer.start();
        consumer2.start();
    }

    private static void exerciseProducerConsumerOneThreadEach() throws InterruptedException {

        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);

        Consumer consumer = new Consumer(buffer);
        consumer.setName("consumer  ");

        producer.start();
        consumer.start();

        // face ca executia threadului main sa continue dupa ce cosumer termina
        // consumer termina sigur inaintea lui producer pt ca el asteapta punearea ultimului element
        // avand acelasi interval de iterare in for
        consumer.join();
    }

    private static void exerciseWithOneThreadAndJoin() throws InterruptedException {

        System.out.println("main");
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
//        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();

        System.out.println("main");
        myThread.join();
        System.out.println("main again");
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("In main , before");
        long before = System.currentTimeMillis();


//        exerciseOneThread();

//        exerciseWithOneThreadAndJoin();

//        execise3theads();

//        countNumbersWithSleep();

//        exerciseProducerConsumerOneThreadEach();

//        exerciseProducerConsumer2ThreadsEach();

//        exerciseCounterModifiedByMultipleThreads();

        System.out.println("In main , after");
        System.out.println("duration = " + (System.currentTimeMillis() - before));

    }


}
