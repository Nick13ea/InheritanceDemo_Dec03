package com.company.inheritanceDemo.VehicleInheritancedemo.AnotherWayVehicleInheritance;

public class BMW extends Car
{
    Boolean heatedSeat=true;

    public BMW(String color, boolean powerSteering, Boolean heatedSeat) {
        super(color, powerSteering);
        this.heatedSeat = heatedSeat;
    }

    public void displayColor(){
        System.out.println(color);
    }
}
