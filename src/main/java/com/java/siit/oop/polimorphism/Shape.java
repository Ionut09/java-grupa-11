package com.java.siit.oop.polimorphism;

import com.java.siit.oop.Color;

public class Shape {
    Color color;

    public void draw() {
        System.out.println("Shape moves");
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Shape moves");
    }
}
