package com.java.siit.lambdas;

import java.util.function.Function;
import java.util.function.Supplier;

import lombok.ToString;

public class MethodReferences {

    public static void main(String[] args) {
        //Function<String, Integer> f1 = (String s) -> s.length();
        Function<String, Integer> f1 = String::length;

        Integer apply = f1.apply("Andrei are Java");
        System.out.println(apply);

        Function<String, Oclasa> f2 = s -> new Oclasa();
        Function<String, Oclasa> f3 = Oclasa::new; //tb sa existe constructor cu argument

        System.out.println(f2.apply("un string"));

        Supplier<Oclasa> s1 = Oclasa::new; //foloseste constructorul  Oclasa()
    }

    @ToString
    static class Oclasa{
        private int a;
        Oclasa(String s){
            System.out.println("inside Oclass connstrictor --> " + s);
        }

        Oclasa(){
            System.out.println("inside Oclass connstrictor --> ");
        }
    }

    static class Sublass extends Oclasa{
        private int a;

        public Sublass(int a) {
            this.a = a;
        }
    }
}
