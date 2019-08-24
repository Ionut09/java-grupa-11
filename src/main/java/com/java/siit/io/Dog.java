package com.java.siit.io;

import com.google.gson.Gson;

import java.lang.reflect.Field;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = true)
public class Dog {
    private transient String name;
    private String color;
    static String race = "bishon";
    int age;

    public static void main(String[] args) {
        Dog dog = new Dog("Azorel", "red",  3);
        Gson gson = new Gson();
        //serializam
        String dogJson = gson.toJson(dog);
        System.out.println(dogJson); //{"color":"red","age":3}

        //deserializam
        Dog azorel = gson.fromJson(dogJson, Dog.class);
        System.out.println(azorel);

        //reflection
        Class<Dog> dogClass = Dog.class;
        dogClass.getSimpleName();
        Field[] declaredFields = dogClass.getDeclaredFields();

        dogClass.getMethods();
        dogClass.getAnnotations();
        dogClass.getDeclaredFields();

    }

    void method(){
        Class<? extends Dog> aClass = getClass();
    }
}