package com.java.siit.recap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OCPQuestions {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);
//        ls.stream()
//          .forEach(System.out::print) //void
//          .map(a -> a * 2).forEach(System.out::print);


        List<String> lettersList = Arrays.asList("j", "a", "v", "a");
        lettersList.replaceAll(string -> string.toUpperCase());
        lettersList.forEach(System.out::print);

        Map<String, String> map = new HashMap<>();
        map.values();
        map.keySet();

    }

    void nestatica() {
        Optional<Double> price = Optional.ofNullable(getPrice("1111"));
        Double x = price.orElse(getPrice("2222"));
    }

    private Double getPrice(String s) {
        return null;
    }


}
