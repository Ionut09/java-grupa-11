package com.java.siit.enums;

public enum Season {
    //list de valori ale enumului tb sa fie prima
    SPRING(3), //0,
    SUMMER(4), //1
    FALL(3),   //2
    WINTER(2);  //3

    private int duration;

    private Season(int s) {
        duration = s;
    }

    public int getDuration() {
        return duration;
    }
}
