package com.java.siit.oop.interfaces;

public abstract class Animal{

    public void eat(){
        System.out.println("Animals eat");
    }

    public abstract void move();

    public Animal(){

    }

    static void staticMethod() { //e statica
        System.out.println("insidde static method from Animal");

    }

    public static void main(String[] args) {
        System.out.println(Domestic.OWNER); //varibilele din interfete pot fi folosite ca atare
    }
}
