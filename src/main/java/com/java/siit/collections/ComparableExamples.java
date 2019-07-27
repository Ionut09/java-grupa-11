package com.java.siit.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

public class ComparableExamples {

    public static void main(String[] args) {
        //int compare(Student o1, Student o2);
        //Comparator e numele interfetei implementate de clasa anonima care n-are nume
        Comparator<Student> comparatorDupaNumeAnonima = new Comparator<Student>() {
            public int compare(Student student1, Student student2) {
                int compareByName = student1.getName().compareTo(student2.getName()); //neg zero sau pozitiv
                int compareByNote = student1.getNote().compareTo(student2.getNote()); //neg zero sau pozitiv
                if (compareByName == 0) {
                    return compareByNote;
                }
                return compareByName;
            }
        };

        Comparator<Student> comparatorDupaNumeLambda = (student1, student2) -> {
            int compareByName = student1.getName().compareTo(student2.getName()); //neg zero sau pozitiv
            int compareByNote = student1.getNote().compareTo(student2.getNote()); //neg zero sau pozitiv
            if (compareByName == 0) {
                return compareByNote;
            }
            return compareByName;
        };
        TreeSet<Student> altSet = new TreeSet<>(comparatorDupaNumeAnonima); //
        System.out.println(altSet.add(new Student("Dan", 10)));
        System.out.println(altSet.add(new Student("Elena", 10)));
        System.out.println(altSet.add(new Student("Elena", 9)));
        System.out.println(altSet);
        Student student = new Student("Dan", 10);
        student.getClothes().add("tricou");
        student.getClothes().add("tricou1");
        student.getClothes().add("tricou2");
        System.out.println( "=========" + student);
    }
}

@Getter
@RequiredArgsConstructor
@ToString
class Student {  //implements Comparable<Student>{
    private final String name;
    private final Integer note;

    //tinem cont de sortare dupa nume in prima faza
//    public int compareTo(Student o) {
//        int compareByName = this.name.compareTo(o.name); //neg zero sau pozitiv
//        int compareByNote = this.note.compareTo(o.note); //neg zero sau pozitiv
//        if (compareByName == 0) {
//            return compareByNote;
//        }
//        return compareByName;
//    }

    final Set<String> clothes = new HashSet<>();

    public Set<String> getClothes() {
        return new HashSet<>(clothes);
    }
}