package com.java.siit.generics;

public class Student implements Comparable<Student> {

    private String name;
    private byte note;

    @Override
    public int compareTo(Student student) {
        return 0;
    }
}
