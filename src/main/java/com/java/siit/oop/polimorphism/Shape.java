package com.java.siit.oop.polimorphism;

import com.java.siit.oop.Color;

import java.util.LinkedList;
import java.util.List;

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
    };

    public static void main(String[] args) {
        Shape shape = new Circle();
        Square square = new Square(); //daca totusi am nevoie de metode specifice din Square
        //cu referinta shape nu pot apela decat metode din clasa Shape, care reprezinta tipul referintei

        if (shape instanceof Square) {
            ((Square) shape).square();//ClassCastExeption
        }

        LinkedList<String> list = new LinkedList<>();

        //((Square) list).square(); does not compile, pt ca nu au nicio treaba

        // ca sa te asiguri ca nu crapa castul, verifici ce obiect ai in spatele referintei

        List<String> linkedList = new LinkedList<>();
        System.out.println(linkedList instanceof LinkedList); //true
        System.out.println(linkedList instanceof List);       //true



    }
}
