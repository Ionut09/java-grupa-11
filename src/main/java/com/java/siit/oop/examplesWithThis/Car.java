package com.java.siit.oop.examplesWithThis;

import static java.lang.Float.compare;

public class Car {
    private float fuelLevel;
    private byte gear;    //0
    private float speed; //0.0

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(2.3F);

        System.out.println(car.gear); //this nu poate fi folosit in context static
    }

    public void setSpeed(float speed2) {
        speed = speed2;
        //this.anotherMethod();
        anotherMethod();
    }

    public void anotherMethod() {
        System.out.println("anther method");
        this.gear = 15; //unde this e car in ex. nostru
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public byte getGear() {
        return gear;
    }

    public void setGear(byte gear) {
        this.gear = gear;
    }

    public float getSpeed() {
        return speed;
    }

    public int hashCode() {
        int hashCodeCareTineContdeTot = Float.hashCode(fuelLevel);
        int hashCodeCareTineContdeTot1 = Float.hashCode(speed);
        Float unFLoat = new Float(2.3);
        unFLoat.hashCode();
        return hashCodeCareTineContdeTot + 51 * gear + 23 * hashCodeCareTineContdeTot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Car))
            return false;

        Car car = (Car) o;
        return compare(this.fuelLevel, car.fuelLevel) == 0 &&
                this.gear == car.gear &&
                compare(this.speed, car.speed) == 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelLevel=" + fuelLevel +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

}
