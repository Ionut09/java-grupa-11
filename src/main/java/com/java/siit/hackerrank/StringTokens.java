package com.java.siit.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: \n");
        String s = scan.nextLine();
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
        }
        String[] tokens = s.split("[^A-Za-z0-9]+");
        System.out.println(tokens.length);
        Arrays.stream(tokens)
              .filter(token -> !token.isEmpty())
              .forEach(System.out::println);
        scan.close();
    }
}
