package com.java.siit.variables;

public class Main {
    public static void main(String[] args) {
        Instance i1 = new Instance();
        Instance i2 = new Instance();
        // avem default values
        System.out.println("for i1 --> " + i1.getA());
        System.out.println("for i2 --> " + i2.getA());

        System.out.println("for i1 --> " + i1.getStr());
        System.out.println("for i2 --> " + i2.getStr());

        i1.setA(5);
        i2.setA(6);
        System.out.println("for i1 --> " + i1.getA());
        System.out.println("for i2 --> " + i2.getA());

        i1.setStr("John");  //bad practice
        i2.setStr("Johnny"); //bad practice
        Instance.str = "Boby";

        System.out.println("for i1 --> " + i1.getStr());
        System.out.println("for i2 --> " + i2.getStr());
    }

    void metodaNoastra(int param1, int param2) {
        String varLocal1 = ""; //nu are valoare default
        System.out.println(varLocal1);
    }
}
