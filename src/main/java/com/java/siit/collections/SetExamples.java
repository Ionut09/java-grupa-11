package com.java.siit.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class SetExamples {

    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        System.out.println(set.add(10));
//        System.out.println(set.add(11));
//        System.out.println(set.add(19));
//        System.out.println(set.add(10));
//
//        NavigableSet<Integer> navigableSet = new TreeSet<>();
//        System.out.println(navigableSet.add(10));
//        System.out.println(navigableSet.add(19));
//        System.out.println(navigableSet.add(2));
//        System.out.println(navigableSet.add(6));
//        System.out.println(navigableSet.add(11));
//        System.out.println(navigableSet.add(10));
//        System.out.println(navigableSet);
//        /*
//         <  lower
//         <= floor
//         >  higher
//         >= ceiling
//         */
//        System.out.println(navigableSet.lower(10));
//        System.out.println(navigableSet.floor(10));
//
//        System.out.println(navigableSet.higher(10));
//        System.out.println(navigableSet.ceiling(10));

        Set<Persoana> altSet = new HashSet<>();
        System.out.println(altSet.add(new Angajat("Dorel", 500)));
        System.out.println(altSet.add(new Angajat("Dorel", 500)));
        System.out.println(altSet.add(new Angajat("Dorel", 500)));
        System.out.println(altSet.add(new Student("Dan", 10)));
        System.out.println(altSet.add(new Student("Dan", 10)));//728246287348672
        altSet.forEach(System.out::println);


    }


    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    static abstract class Persoana {
        String name;

    }

    @Getter
    @Setter
    @ToString
    static class Somer extends Persoana {
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

        @Override
        //egalitatea dupa nume si salariu
        public boolean equals(Object celalaltAngajat) {  //this.equals(object)
            if (this == celalaltAngajat) return true;

            if (!(celalaltAngajat instanceof Angajat)) return false;

            Angajat altAngajat = (Angajat) celalaltAngajat;
            return this.name.equals(altAngajat.name)
                    && this.salary == altAngajat.salary;
        }

        @Override
        public int hashCode() {
            return salary + name.hashCode();
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
        @Override
        //egalitatea dupa nume si salariu
        public boolean equals(Object celalaltStudent) {  //this.equals(object)
            if (this == celalaltStudent) return true;

            if (!(celalaltStudent instanceof Student)) return false;

            Student altStudent = (Student) celalaltStudent;
            return this.name.equals(altStudent.name)
                    && this.note == altStudent.note;
        }

        @Override
        public int hashCode() {
            return Objects.hash(note, name);
        }
    }
}
