package com.java.siit.exception;

public class CheckedExceptions {
/*
IOException, FileNotFoundException,
JAXBException,
ParseException,
SQLException,
TimeoutException
ClassNotFoundException
 */

//    public static void main(String[] args) throws Exception {
//        System.out.println(circleArea(-10.5));
//
//        System.out.println("some other heavy logic");
//    }
    public static void main(String[] args) {
        try {
            System.out.println(circleArea(-10.5));
        } catch (Exception e) {
            System.out.println("Cannot calculate area: exception message --> " + e.getMessage());
        }
        System.out.println("some other heavy logic");
        System.out.println("some other heavy logic");
        System.out.println("some other heavy logic");
        System.out.println("some other heavy logic");

    }

    static double circleArea(double radius)  throws Exception{
        if (radius < 0) {
            throw new Exception("radius should be positive"); //checked, catch or declare
        }
        return Math.PI * radius * radius;
    }
}
