package com.company.Dec03Inheritance.FinalKeyword;
//final makes a variable constant, so we always hv to pass value through it
//final is a keyword which stops one class to be inherited
//use capital letters for final keywords
final class Calculator {
   final int ROLL_NUMBER=100;

    public void canCalculate() {
        System.out.println("calculating number");
    }
}

class Computer {
    public void canProcessData() {
        System.out.println("processing data");
    }
}

public class TestMain {
    public static void main(String[] args) {

    }
}
