package com.java.siit.oop;

import java.util.ArrayList;

public class DoubleBraceInitializer {

    private static ArrayList<String> list = new ArrayList<String>(){{
        add("1");
        add("2");
        add("3");
    }};

    public static void main(String[] args) {
        // void accept(String t);
        list.forEach( (String element) -> System.out.println(element));
    }
}
