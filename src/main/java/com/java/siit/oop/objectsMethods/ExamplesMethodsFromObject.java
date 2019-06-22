package com.java.siit.oop.objectsMethods;

import com.java.siit.oop.examplesWithThis.Car;

public class ExamplesMethodsFromObject {

    public static void main(String[] args) {
        //toString example
        Car car1 = new Car();
        car1.setSpeed(120);
        car1.setGear((byte) 5);
        car1.setFuelLevel(100);

        System.out.println(car1.toString());
        System.out.println("Car object -->" + car1);

        //equals example
        Car car2 = new Car();
        car2.setSpeed(120);
        car2.setGear((byte) 5);
        car2.setFuelLevel(101);

        Car car3 = car1;
        System.out.println("car1 == car2 -> " + (car1 == car2));//false
        System.out.println("car1 == car3 -> " + (car1 == car3));//true

        System.out.println("car1.equals(car2) -> " + car1.equals(car2));//false in momentul asta

        System.out.println(car1.getClass().getSimpleName());
        System.out.println(car1.getClass().getName());
    }
}
