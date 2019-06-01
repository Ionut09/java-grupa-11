package com.java.siit.oop.polimorphism;

public class Circle extends Shape {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Shape shape = circle1;

        shape.draw();
        circle1.moveCircle();
    }

    public void moveCircle() {
        System.out.println("only Circle moves");

    }

    @Override
    public void draw() {
        System.out.println("Circle draws");
    }

    @Override
    public void move() {
        System.out.println("Circle moves");

    }
}
