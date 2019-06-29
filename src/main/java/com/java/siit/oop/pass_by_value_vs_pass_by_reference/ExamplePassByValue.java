package com.java.siit.oop.pass_by_value_vs_pass_by_reference;

import java.util.ArrayList;
import java.util.List;

public class ExamplePassByValue {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("before method -->" + list); //[1, 2, 3, 4]
        method(list);
        System.out.println("after method -->" + list); // [1, 2, 3, 4, Un alt string]

        int x = 5;
        System.out.println("before method -->" + x); //5
        method(x);
        System.out.println("after method -->" + x); //5

        list.forEach( element -> System.out.println(element));

    }


    private static void method(int paramInt) {
        paramInt++;
        paramInt++;
        paramInt++;
        paramInt++;
        System.out.println("inside method paramInt value is -->" + paramInt);
    }

    private static void method(List<String> paramList) {
        paramList.add("Un alt string");
    }
}
