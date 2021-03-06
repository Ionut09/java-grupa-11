package com.java.siit.lambdas;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Zoo {

    static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        animals.add(new Lion());
        animals.add(new Fish());
        animals.add(new Kangoroo());
        animals.add(new Fish());
        animals.add(new Kangoroo());
        animals.add(new Lion());

//        short s = Short.MAX_VALUE;
//        char c = (char) s;
//        System.out.println( c == Short.MAX_VALUE);

        //boolean test(Animal t) -- semnatura metodei test din Predicate
        printAnimals(animal -> animal.canSwim());

        //echivalent cu
        printAnimals(new Predicate<Animal>() {
            @Override
            public boolean test(Animal animal) {
                return animal.canSwim();
            }
        });

        //echivalent cu
        printAnimals(new AnimalChecker());
    }


    static void printAnimals(Predicate<Animal> haveACertainFeature) {
        for (Animal animal : animals) {
            if (haveACertainFeature.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}

class AnimalChecker implements Predicate<Animal> {
    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}