package com.company.Dec03Inheritance.Abstraction;

// abstraction - it should have minimum of 1 abstract method,
// and it should start with abstract keyword
//abstracting means basically define a class. they should hv abstract method.
//forcing them to implement these features
//u cant create object of abstract class

abstract class Computer{
    //methods for abstraction
    abstract void calculate();
    abstract void playGames();

    public void surfWebsite(){
        System.out.println("Opening google! ");
    }
}
//child class
class PlayStation extends Computer{

    @Override
    void calculate() {
        System.out.println("calculate number of players");
    }

    @Override
    void playGames() {
        System.out.println("can play fifa 2023");
    }
}
public class TestMain {
    public static void main(String[] args) {
       // Computer computer=new Computer(); no object can be created of abstract class
        // PlayStation playStation=new PlayStation();
        //   playStation.calculate();
        // playStation.playGames();
        Computer computer=new PlayStation();
        computer.calculate();
        computer.playGames();
        computer.surfWebsite();
    }
}
