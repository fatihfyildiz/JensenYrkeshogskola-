package org.example.Lektion7_InheritEncapsulPolymorp;

public class Animal {

    public String name;

    public Animal(String name){
        this.name= name;
    }
    void makeSound(){
        System.out.println("The animal makes a sound");
    }

    void eat(){
        System.out.println("The animal eats a suitable thing");
    }

}
