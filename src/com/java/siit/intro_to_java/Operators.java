package com.java.siit.intro_to_java;

/**
 yduhbduhbweu
 @author ionut
 */
public class Operators {
    public static void main(String[] args) {
//        int a = 65, b = 78;
//
//        int c = a >> 2;
//
//        System.out.println("a =      " + Integer.toBinaryString(a));
//        System.out.println("a >> 2 = " + Integer.toBinaryString(c));
//
//        System.out.println("b =      " + Integer.toBinaryString(b));
//        System.out.println("b >> 2 = " + Integer.toBinaryString(b >> 2));
//
//        String str;
//        int e = 2, d = 4;
////        if (e > d) {
////            str = "big";
////        } else {
////            str = "small";
////        }
//
//         str = (e > d) ? "big" : "small";
//         // str = (a>b) ? computeArea(e, d) : "small"; nu merge
//
//        System.out.println(" str instanceof String --> " +str instanceof String);
//        System.out.println(" str instanceof CharSequence --> " +str instanceof CharSequence);
//
//        System.out.println(d--);
//        System.out.println(d);
//        d = 4;
//        System.out.println(--d);


        int q=12, w=15;
        q+=4;
        w++;
        System.out.println(q);
        System.out.println(w);

        double ternar = (q>w) ? 3.2 : 1.2; //ternar
        System.out.println(ternar);
        computeArea(2,4);
        Operators.computeArea(2,3);

    }


    /**
     * O metoda care calculeaza aria
     * @param a latimea
     * @param b lungimea
     * @author Ionut
     * @throws
     */
    private static void computeArea(int a, int b){
        System.out.println("Area is: " + (a*b));
    }


}
