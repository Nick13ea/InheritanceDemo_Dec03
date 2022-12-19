package com.company.inheritanceDemo.VehicleInheritancedemo.AnotherWayVehicleInheritance;
//subclass of vehicle class
public class Car extends Vehicle {
    boolean powerSteering = true;

    public Car(String color, boolean powerSteering) {
        //super can only exist in 1st line only
        //it's used to connect to super class
        super(color);
        this.powerSteering = powerSteering;
    }

    public void displayColor() {
        System.out.println(color);
    }
}
