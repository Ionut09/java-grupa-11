package com.java.siit.oop.constructors;

class Bomber extends Plane {
    public Bomber(int speed) {
        this(2, 800);
    }

    public Bomber(int engines, int speed) {
        super(2, 800);
    }
}

public class ConstructorsExamples {
    public static void main(String[] args) {

    }


}

class Plane {
    private final int engines;
    private final int speed;

    //avand doar constructor private clasa nu mai poate fi extinsa
//    private Plane() throws IllegalArgumentException{
//        this(2, 800);
//    }

    Plane(int engines, int speed) {
        this.engines = engines;
        this.speed = speed;
        //much more logic
    }
//    Plane(){
//        this(2, 800);
//    }

}
