package org.example.Lektion7_InheritEncapsulPolymorp.Interfaces;

import org.example.Lektion7_InheritEncapsulPolymorp.Animal;

public class Bird extends Animal implements Flyable, Singable{


    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Birds fly");
    }

    public static void main(String[] args) {
        Bird myBird= new Bird("Karga");

        myBird.fly();
        myBird.sing();
    }

    @Override
    public void sing() {
        System.out.println("Cik cik");
    }
}
