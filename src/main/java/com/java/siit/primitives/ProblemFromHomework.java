package com.java.siit.primitives;

import com.java.siit.oop.polimorphism.Circle;
import com.java.siit.oop.polimorphism.Shape;
import com.java.siit.oop.polimorphism.Square;
import com.java.siit.oop.polimorphism.Triangle;

import java.util.Scanner;

public class ProblemFromHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value:");

        long x = sc.nextLong();

        if (x >= -128 && x <= 127) {
            System.out.println("* byte");
        }
        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }

        int intArray[] = new int[2];
        Object intArrayObj = new int[2];


        Shape[] shapes = new Shape[5];//{null, null, null, null, null}
        shapes[0] = new Square();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();
        shapes[3] = new Shape();

        for (Shape shape : shapes) {
            shape.draw();
            if (shape instanceof Triangle) {
                System.out.println("this is a triangle");
            }
            if (shape instanceof Object) {
                System.out.println("everything is an object");
            }
        }


    }
}
