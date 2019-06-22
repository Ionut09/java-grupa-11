package com.java.siit.oop;

import com.java.siit.oop.polimorphism.Circle;
import com.java.siit.oop.polimorphism.Shape;
import com.java.siit.oop.polimorphism.Square;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CastExamples {
    public static void main(String[] args) {
        //cast example
        Shape circle = new Circle();
        Circle castedCircle = (Circle) circle;
        castedCircle.moveCircle();

        //((Circle) circle).moveCircle();

        method(new Square());
        Class<Shape> shapeClass = Shape.class;
        Field[] fields = shapeClass.getDeclaredFields();
        Method[] methods = shapeClass.getDeclaredMethods();
    }

    static void method(Shape shape) {
        Circle castedCircle = null;
        if (shape instanceof Circle) {
            castedCircle = (Circle) shape;
            System.out.println("verificare instaanceof");
            castedCircle.draw();
        }

        // Car compileErrorCast = (Car) shape;


    }
}
