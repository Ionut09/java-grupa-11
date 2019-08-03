package com.java.siit.assignment;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DrawingTool {
    private List<Shape> shapes = new ArrayList<>();

    public boolean addShape(Shape shape) {
        if (shapes.contains(shape)) { //o sa avem nevoie de equals and hashcode in obiecte
            return false;
        }
        shapes.add(shape);
        return true;
    }

    public double calculatePerimeterForAllShapes(){
        double perimeter = 0;
        for (Shape shape: shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    public double calculateAreaForAllShapes(){
        double area = 0;
        for (Shape shape: shapes) {
            area += shape.calculateArea();
        }
        return area;
    }
}
