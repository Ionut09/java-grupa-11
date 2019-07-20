package com.java.siit.collections;

import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ListExamples {

    /**
     * Create an ArrayList in which you add Persoane(Somer, Angajat, Student);
     * iterate through the ArrayList and print the name of each person
     */
    public static void main(String[] args) {

        List<Persoana> bucharestHabbitants = new LinkedList<>();

        bucharestHabbitants.add(new Angajat("Dorel", 1000));
        Somer bobita = new Somer("Bobita", 800);
        bucharestHabbitants.add(bobita);
        bucharestHabbitants.add(new Somer("Bobita", 800));
        bucharestHabbitants.add(new Student("Mihai", 10));

        bucharestHabbitants.forEach(person -> System.out.println(person.getName()));

        System.out.println(bucharestHabbitants.contains(new Somer("Bobita", 800))); //se bazeaza pe equals
        bucharestHabbitants.remove(bobita);
        bucharestHabbitants.forEach(person -> System.out.println(person.getName()));

        Persoana dorel = bucharestHabbitants.get(0);
        System.out.println("dorel -->" +dorel);

        //sa-l schimbam pe dorel
        int indexOfDorel = bucharestHabbitants.indexOf(dorel);
        bucharestHabbitants.set(indexOfDorel, new Angajat("Dorel 2.0", 900));
        System.out.println("After dorel was fired");
        bucharestHabbitants.forEach(person -> System.out.println(person.getName()));

        // Persoana apply(Persoana t);
        bucharestHabbitants.replaceAll(persoana -> new Student("CHina people", 7));
        System.out.println("After china people invaded Romania");
        bucharestHabbitants.forEach(person -> System.out.println(person.getName()));

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    static abstract class Persoana {
         String name;

    }

    @Data
    static class Somer extends Persoana{
        final int welfare;

        public Somer(String name, int welfare) {
            super(name);
            this.welfare = welfare;
        }
    }

    @Getter
    @Setter
    @ToString
    static class Angajat extends Persoana {
        int salary;

        public Angajat(String name, int salary) {
            super(name);
            this.salary = salary;
        }
    }

    @Getter
    @Setter
    @ToString

    static class Student extends Persoana {
        int note;

        public Student(String name, int note) {
            super(name);
            this.note = note;
        }
    }

}
