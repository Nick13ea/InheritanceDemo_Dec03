package com.company.inheritanceDemo.VehicleInheritancedemo;

public class VehicleInheritance
{

     String color;
     String engineType;
     String numberOfTires;
     String fuelType;

    public void accelerate(){
        System.out.println("accelerate");
    }
    public void applyBrake(){
        System.out.println("slow down");
    }
}
//inherited class car inheriting vehicle class
//we can inherit properties nd methods as well
class Car extends VehicleInheritance {
    String color;
    String engineSize ;
    String numberOfTires ;
    String fuelType ;
    String numberOfSeats;

    public Car(String color, String engineSize, String numberOfTires, String fuelType, String numberOfSeats) {
        this.color = color;
        this.engineSize = engineSize;
        this.numberOfTires = numberOfTires;
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
    }

    public void accelerateFast() {
        //default constructor
        System.out.println("Car is speeding");
    }

    public void applyBreakFast() {
        System.out.println("Car is braking");
    }
//toString method for overriding this. things line 27
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", numberOfTires='" + numberOfTires + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", numberOfSeats='" + numberOfSeats + '\'' +
                '}';
    }
    //main class
    public static void main(String[] args) {
        Car car=new Car("red","100","4","Petrol","4");
        System.out.println(car);
        car.color="Red";
        car.accelerate();
        car.applyBrake();
    }
}

//extends property is used to extend the class. 
//making 1 class super class of other class
//inheritance - inheriting the parent class properties
