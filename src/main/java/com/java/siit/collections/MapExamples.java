package com.java.siit.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MapExamples {
    //void clear()
    //boolean isEmpty()
    //int size()
    //V get(Object key)
    //V put(K key, V value)
    //V remove(Object key)
    //boolean containsKey(Object key)
    //boolean containsValue(Object)
    //Set<K> keySet()
    //Collection<V> values()

    public static void main(String[] args) {
        Map<String, Person> personsMap = new HashMap<>();
        personsMap.put("Gica", new Angajat("Gica", 2000));
        personsMap.put("Johny", new Student("Johny", 10));
        personsMap.put("Johny", new Student("Andrei", 11));
        System.out.println(personsMap);
        System.out.println(personsMap.size()); //2
        System.out.println(personsMap.get("Johny"));
        System.out.println(personsMap.remove("Johny"));
        System.out.println(personsMap);
        System.out.println(personsMap.containsKey("Johny")); //false
        System.out.println(personsMap.containsKey("Gica")); //true

        //containsValue se bazeaza pe equals and hashCode din clasa valorii (Person) pt gasirea obiectului
        System.out.println(personsMap.containsValue(new Angajat("Gica", 2000)));
        if (!personsMap.containsKey("Johny")) {
            personsMap.put("Johny", new Student("Andrei", 11));
        }
        System.out.println(personsMap.keySet());
        System.out.println(personsMap.values());
        System.out.println("\n\nentries from the Map, Entry is o sub interface of Map");

        personsMap.entrySet().forEach(System.out::println);

        //personsMap.computeIfAbsent() //de facut dupa ce facem lambdas
        //R apply(T t);
    }


    @Getter
    @Setter
    @AllArgsConstructor
    //@EqualsAndHashCode
    static abstract class Person {
        String name;
    }

    @Data
    static class Somer extends Person {
        final int welfare;

        public Somer(String name, int welfare) {
            super(name);
            this.welfare = welfare;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SetExamples.Somer)) return false;
            SetExamples.Somer somer = (SetExamples.Somer) o;
            return welfare == somer.welfare;
        }

        @Override
        public int hashCode() {
            return Objects.hash(welfare);
        }
    }

    @Getter
    @Setter
    @ToString
    //@EqualsAndHashCode(callSuper = true)
    static class Angajat extends Person {
        int salary;

        public Angajat(String name, int salary) {
            super(name);
            this.salary = salary;
        }
    }

    @Getter
    @Setter
    @ToString
    @Data
    static class Student extends Person {
        int note;

        public Student(String name, int note) {
            super(name);
            this.note = note;
        }
    }
}
