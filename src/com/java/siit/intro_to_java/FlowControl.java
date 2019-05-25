package com.java.siit.intro_to_java;

public class FlowControl {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 20) {
                System.out.println("Am intalnit continue, ignoram 20 si continuam cu urmatoarea iteratie!");
                continue;
            }
            if (x == 40) {
                System.out.println("Am intalnit break, inchidem bucla!");
                break;
            }
            System.out.println(x);
        }
    }
}
