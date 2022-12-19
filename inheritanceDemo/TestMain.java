package com.company.inheritanceDemo;

public class TestMain {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.bark();
        d.eat();

        PuppyDog pd=new PuppyDog();
        pd.cry();

        Cat cat=new Cat();
        cat.makeSound();

    }
}
/*
* why> code re-usability, method overriding
*
* Type:
* 1 single inheritance A ----> B
* 2 Multilevel inheritance A---->B---->C
* 3 Hierarchical  A
*               /   \
*              B     C
* 4 Multiple - java doesn't support
* 5 Hybrid - No support
*
*
*
*
* */