package com.company.Dec03Inheritance.DiamondProblembigclasses;

public class Apple extends Electronics {

    public Apple(int gear, int speed) {
        super(gear, speed);
    }

    public void applyBrakes(int decrement) {
        speed = speed + speed - decrement;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Apple apple=new Apple(4,6);
        Electronics electronics=new Electronics(2,4);
        System.out.println(apple.toString());
        System.out.println(electronics.toString());
    }
}
