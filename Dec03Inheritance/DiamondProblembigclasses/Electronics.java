package com.company.Dec03Inheritance.DiamondProblembigclasses;

public class Electronics {

    int gear;
    int speed;

    //constructor
    public Electronics(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void giveSpeed(int increment) {
        speed = speed + increment;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
