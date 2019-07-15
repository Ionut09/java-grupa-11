package com.java.siit.generics;

import com.java.siit.oop.examplesWithThis.Car;

public class OrderedPairWithSpecifiedGenerics implements Pair<String, Car> {
    private String key;
    private Car value;

    public OrderedPairWithSpecifiedGenerics() {

    }
    public OrderedPairWithSpecifiedGenerics(String key, Car value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Car getValue() {
        return value;
    }

    public static void main(String[] args) {
        new OrderedPair<String, Car>();
        new OrderedPairWithSpecifiedGenerics();
    }
}
