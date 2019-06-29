package com.java.siit.oop.pass_by_value_vs_pass_by_reference;

public class Immutablity {

    public static void main(String[] args) {
        String ana = "Ana";

        String unaltObiectDecatCelInitial = ana.toUpperCase();
        ana.substring(2);

        System.out.println(ana);//Ana
        System.out.println(unaltObiectDecatCelInitial);//ANA

        metodaCuParametruImmutabil(ana);
        System.out.println(ana);//Ana
    }

    private static void metodaCuParametruImmutabil(String s) {
        s += " are mere!";
        s.concat(" are mere!");
    }


}


class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
}
class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name){
        super(name);
    }
}
