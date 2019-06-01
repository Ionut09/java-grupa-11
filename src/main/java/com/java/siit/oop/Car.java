package com.java.siit.oop;

public class Car {
    private Color color; //null
    private float fuelLevel;
    private byte gear; //0
    private float speed; //0.0

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(float fuelLevel) {
        //this.fuelLevel se refera la fieldul fuelLevel
        // fuelLevel fara this se refera la parametrul sau variabila locala fuelLevel
        if (fuelLevel < 0 || fuelLevel > 100) {
            throw new IllegalArgumentException("FuelLevel must be between 0 - 100!!!");
        }

        this.fuelLevel = fuelLevel;
    }

    public byte getGear() {
        return gear;
    }

    public void setGear(byte gear) {
        if (gear < 1 || gear > 10) {
            throw new IllegalArgumentException("Gear must be between 0 - 10, for Mercedes!!!");
        }
        this.gear = gear;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
