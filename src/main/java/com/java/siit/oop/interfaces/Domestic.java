package com.java.siit.oop.interfaces;

import java.io.Serializable;

public interface Domestic extends Serializable, Cloneable {

    public static final String OWNER = "Ionut";
    public final String OWNER1 = "Ionut";
    public static String OWNER2 = "Ionut";
    static final String OWNER3 = "Ionut";
    static String OWNER4 = "Ionut";
    final String OWNER5 = "Ionut";
    String OWNER6 = "Ionut";
    public String OWNER9 = "Ionut"; //toate sunt echivalente

    public abstract void pet();

//    abstract void pet1();
//
//    public void pet2();
//
//    void pet3(); //toate sunt echivalente

    //TO DO METODELE default si statice

    // void defaultMethod() { nu compileaza pt ca e privita ca public abstract void defaultMethod care nu poate sa aiba body
    default void defaultMethod() { //e ca metodele de instanta
        System.out.println("default purr for all domestics");
    }

    static void staticMethod() { //e statica
        System.out.println("insidde default method");

    }
}
