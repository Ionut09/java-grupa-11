package com.java.siit.enums;

import java.util.Arrays;

import static com.java.siit.enums.Season.SUMMER;
import static com.java.siit.enums.Season.WINTER;

public class Enums {
    public static void main(String[] args) {
        switchWithStrings("SUMMER");
        switchWithEnums(SUMMER);

        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
        System.out.println(WINTER);     //orice valooare printata e exact numele enumului
        Season season = Season.valueOf("WINTER");
        System.out.println("parsedEnum-->" + season);

        //fiecare aenum are in spate un intreg, ordinal
        Arrays.stream(values)
              .forEach(value -> System.out
                      .println("value: " + value + "    ||| ordinal: " + value.ordinal() + "    ||| duration of the season: " + value.getDuration()));
    }

    private static void switchWithEnums(Season anotimp) {
        switch (anotimp) {
            case SPRING:
                System.out.println("it's spring");
                break;
            case SUMMER:
                System.out.println("it's summer");
                break;
            case FALL:
                System.out.println("it's FALL");
                break;
            case WINTER:
                System.out.println("it's WINTER");
                break;
        }
    }

    private static void switchWithStrings(String anotimp) {
        //SPRING, SUMMER, FALL, WINTER
        switch (anotimp) {
            case "SPRING":
                System.out.println("it's spring");
                break;
            case "SUMMER":
                System.out.println("it's summer");
                break;
            case "FALL":
                System.out.println("it's FALL");
                break;
            case "WINTER":
                System.out.println("it's WINTER");
                break;
        }
    }
}
