package com.java.siit.oop.polimorphism;

public class Triangle extends Shape {

    public void draw() {
        System.out.println("Triangle draws");
    }

    @Override
    public void move() {
        System.out.println("Triangle moves");

    }
}
