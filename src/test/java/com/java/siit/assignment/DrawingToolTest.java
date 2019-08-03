package com.java.siit.assignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DrawingToolTest {
    private DrawingTool tool = new DrawingTool();

    @Test
    public void addShapeTest() {
        tool.addShape(new Circle(3.3));
        tool.addShape(new Circle(3.3));
        assertTrue(tool.getShapes().size() == 1);
    }

    @Test
    public void calculatePerimeterForAllShapesTest() {
        tool.addShape(new Circle(3.3));
        tool.addShape(new Square(3.3));
        tool.addShape(new Triangle(5));
        //java.math.BigDecimal pt financial stuffs
        assertEquals(48.93, tool.calculatePerimeterForAllShapes(), 0.01);
    }

    @Test
    public void calculateAreaForAllShapesTest() {
        tool.addShape(new Circle(3.3));
        tool.addShape(new Square(3.3));
        tool.addShape(new Triangle(5));
        assertEquals(66.75, tool.calculateAreaForAllShapes(), 0.01);
    }
}