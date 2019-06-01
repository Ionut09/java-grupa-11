package com.java.siit.primitives;

public class Play {

    public static void main(String[] args) {
        System.out.println('a' + "b");
        System.out.println('a' + 1);
        System.out.println('b' + 1);
        System.out.println('c' + 1);
        System.out.println('A' + 1);

        byte a = 15;
        short b = 2;
        char c = 1;
        char c1 = 'c';
        int d = 21;
        long e = 1119894L;
        long e1 = 1119894l;

        //rezultatul unei operatii are tipul celui mai mare dintre operanzi
        int sum = 3 + 5;
        byte a1 = 12 + 2; //merge
        //rezultatul unei operatii intre doi intregi, i.e. suma, in general e int
        byte a2 = (byte) (12 + b); // nu merge

        c = (char) d;
        a = (byte) e;
        System.out.println(a);

        float f = 3.2f;
        float f1 = 3.2F;
        double db = Math.sqrt(3);
        System.out.println(f);
        System.out.println(db);
        System.out.println(d / b);//10
        System.out.println((double) d / b); //10.5
        System.out.println(d / 2.0); //10.5
        // System.out.println(d/0); // java.lang.ArithmeticException

        System.out.println(Math.sin(db) * Math.sin(db) + Math.cos(db) * Math.cos(db));

    }
}
