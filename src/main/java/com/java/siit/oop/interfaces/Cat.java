package com.java.siit.oop.interfaces;

public class Cat extends Animal implements Domestic {
    @Override
    public void move() {
        System.out.println("Cats run");
    }

    @Override
    public void pet() {
        System.out.println("Cats pet");
    }

    static void staticMethod() { //e statica
        System.out.println("insidde static method from Cat");

    }
    public static void main(String[] args) {
        //Cat is a Animal
        //Cat is a Domestic
        Cat pisi = new Cat();
        pisi.move();
        pisi.pet();
        pisi.eat();

        Animal pisiAnimal = null;
        Domestic pisiDomestica = new Cat();

        pisiDomestica.pet();
        pisi.defaultMethod();

        Domestic.staticMethod(); //metodele statice din interfete nu pot fi apelate decat cu numele interfetei

        pisi.staticMethod(); //"insidde static method from Cat" pt cat pisi e de tip Cat
        pisiAnimal.staticMethod(); //"insidde static method from Animal" pt ca pisiAnimal e de tip Animal


    }
}
