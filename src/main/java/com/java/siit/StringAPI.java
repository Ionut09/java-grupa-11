package com.java.siit;

import java.util.Arrays;

public class StringAPI {
    public static void main(String[] args) {
        String ana = "Ana are  mere";
        String anaUpperCase = ana.toUpperCase();

        System.out.println(ana); // "Ana are mere";
        System.out.println(anaUpperCase); // "ANA ARE MERE";

        String substring = ana.substring(4);
        System.out.println(substring);
        System.out.println(returnsString(ana));

        String[] splitted = ana.split("\\s+");//s [0-9]+ [a-z]
        String[] splittedByWords = ana.split("[a-zA-Z]+");//s [0-9]+ [a-z]
        System.out.println(Arrays.toString(splitted));
        System.out.println(Arrays.toString(splittedByWords));
        String ana2 = "Ana,are,mere";
        String[] splittedByComma = ana2.split(",");
        System.out.println(Arrays.toString(splittedByComma));

        String replaceAll = ana2.replaceAll(",", "------");
        System.out.println("replaceAll-->"+replaceAll);
        System.out.println("replaceAll-->"+ana2);
    }

    private static String returnsString(String string){
        //return string.substring(3, 8);
        return string.substring(3, string.indexOf('m'));
    }
}
