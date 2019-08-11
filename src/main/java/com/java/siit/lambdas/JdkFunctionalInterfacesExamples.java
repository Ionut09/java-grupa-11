package com.java.siit.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class JdkFunctionalInterfacesExamples {

    public static void main(String[] args) {
        //
        Function<String, Integer> f1 = s -> s.length();

        Integer apply = f1.apply("Andrei are Java");
        System.out.println(apply);

        //f(String, Integer) : boolean
        BiPredicate<String, Integer> biPredicate = (s, length) -> s.length() == length;

        List<String> stringList = new ArrayList<>();
        stringList.forEach(stringFromList -> {
            if (biPredicate.test(stringFromList, 5)) {
                System.out.println(stringFromList);
            }
        });
    }
}
