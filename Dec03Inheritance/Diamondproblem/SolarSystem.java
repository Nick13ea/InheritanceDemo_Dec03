package com.company.Dec03Inheritance.Diamondproblem;

public class SolarSystem extends Jupiter {
    public void contains() {
        System.out.println("solar system contains earth n jupiter");
    }


    public static void main(String[] args)
    {
        SolarSystem solarSystem=new
                SolarSystem();
        solarSystem.rain();
        solarSystem.contains();


    }
}