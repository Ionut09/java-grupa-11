package com.java.siit.methods.recursive.fibonacci;

public class Fibonacci {
    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int fibonacciNumber = fibonacci(10);
        for (int i = 1; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
