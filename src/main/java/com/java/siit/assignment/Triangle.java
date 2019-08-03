package com.java.siit.assignment;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Triangle implements Shape {
    private double side;

    @Override
    public double calculateArea() {
        return side * side * Math.sqrt(3) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side * 3;
    }
}
