package com.java.siit.primitives;

import java.util.Scanner;

/**
 * The HelloWorldApp class simply prints
 * "Hello World!" to standard output
 *
 * @author Ionut Spalatelu
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti numerele: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(b + ", " + a);
    }

}
