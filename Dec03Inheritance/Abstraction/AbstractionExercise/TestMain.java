package com.company.Dec03Inheritance.Abstraction.AbstractionExercise;

abstract class Drinks {
    abstract void quantity();

    abstract void color();
}


class Coke extends Drinks {

    @Override
    void quantity() {
        System.out.println("Coke is 1Litre");
    }

    @Override
    void color() {
        System.out.println("Coke is black in color");
    }
}

class MtnDew extends Coke {
    @Override
    void quantity() {
        System.out.println("Mtn Dew is 2litre");
    }

    @Override
    void color() {
        System.out.println("Mtn dew is green in color");
    }
}

public class TestMain {
    public static void main(String[] args) {

        Drinks coke = new Coke();
        Drinks mtnDew = new MtnDew();
        coke.color();
        coke.quantity();
        mtnDew.color();
        mtnDew.quantity();
    }


}
