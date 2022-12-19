package com.company.inheritanceDemo.VehicleInheritancedemo.AnotherWayVehicleInheritance;

public class Vehicle {
    public String color = "Black";

    public Vehicle(String color) {
        this.color = color;
    }

    public void printFromVehicle() {
        System.out.println("i am coming from vehicle class");
    }
}