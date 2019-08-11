package com.java.siit.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx {
    public static void main(String[] args) {
        String[] array = {"Andrei", "Codrut", "Mihai", "Mihai", "Ionut", "Dan", "Elena"};
        List<String> names = Arrays.asList(array);
        Stream<String> stringStream = Stream.of(array);

        stringStream.map(String::toLowerCase) // Stream<String>
                    .distinct() // Stream<String>
                    .sorted() // Stream<String>
                    .filter(name -> name.contains("a"))  // Stream<String>
                    .forEach(System.out::println);

        boolean anyMatch = namesThatStartWith(names, "D");
        System.out.println(anyMatch);
        //stringStream.count();  java.lang.IllegalStateException: stream has already been operated upon or closed
        System.out.println(String.valueOf(35));

        var chareactersList =
                names.stream()
                     .map(name -> name.split(""))
                     .flatMap(arrayDeCaractereDintr_unWord -> Arrays.stream(arrayDeCaractereDintr_unWord))
                     //A, n, d, r, e, i
                     .map(String::toUpperCase)
                     .distinct()
                     //.collect(toSet());
                     .collect(Collectors.toCollection(HashSet::new));
                     //.collect(Collectors.toCollection(ArrayList::new));
                     //.collect(Collectors.toList());
                    // .collect(Collectors.toSet());
        System.out.println(chareactersList);

        lazyEvaluation();


    }

    private static boolean namesThatStartWith(List<String> names, String begin) {
        return names.stream()
                    .filter(name -> name.startsWith(begin))
                    .map(String::length)
                    .map(String::valueOf)
                    .anyMatch(l -> l.length() == 3);
    }

    private static void lazyEvaluation() {
        List<String> names = new ArrayList<>();
        //"Andrei", "Codrut", "Mihai", "Mihai", "Ionut", "Dan", "Elena"
        names.add("Andrei");
        names.add("Codrut");
        names.add("Mihai");
        names.add("Ionut");
        Stream<String> stringStream = names.stream()
                                           .filter(name -> name.toLowerCase().contains("a"));
        names.add("Dan");
        names.add("Elena");

        long namesNumber = stringStream.count(); // 4
        System.out.println("contain letter a --> " + namesNumber);



    }

}

