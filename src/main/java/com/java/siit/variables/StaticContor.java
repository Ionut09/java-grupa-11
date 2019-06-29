package com.java.siit.variables;

public class StaticContor {

    int instanceField = 0;
    static int contor = 0;

    public StaticContor() {
        contor++;
        instanceField+=5;
    }

    public static void main(String[] args) {
        StaticContor staticContor = new StaticContor();
        new StaticContor();

        new StaticContor();
        new StaticContor();
        new StaticContor();
        new StaticContor();

        System.out.println("contor --> "+StaticContor.contor);
        System.out.println("instanceField --> "+staticContor.instanceField);
    }
}
