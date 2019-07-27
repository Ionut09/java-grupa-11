package com.java.siit.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExamples {
    /**
     * boolean add(E e)
     * E element()
     * boolean offer(E e)
     * E remove()
     * void push(E e)
     * E poll()
     * E peek()
     * E pop()
     */

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        //Deque e stackul din liceu sau LIFO
        //Queue e coada sau FIFO
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(9);
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.getFirst());
        System.out.println("offer - " + queue.offer(12));
        queue.addFirst(15);
        queue.addLast(16);
        System.out.println(queue.pop()); //it retrage si sterge
        System.out.println(queue.peek()); //2
        System.out.println(queue.poll()); //head of the queue
        queue.push(20);
        System.out.println(queue);

    }
}
