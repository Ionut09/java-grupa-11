package com.java.siit.oop.polimorphism;

public class Square extends Shape {
    public void draw() {
        System.out.println("Square draws");
    }

    @Override
    public void move() {
        System.out.println("Square moves");

    }

    public void square(){
        System.out.println("square");
    }
}
