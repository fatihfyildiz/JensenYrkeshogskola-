package org.example.Lektion7_InheritEncapsulPolymorp;

public class Dog extends Animal{

    public static void makeAnimalEat(Animal animal){
        animal.eat();
    }



    public Dog(String name) {
        super(name);
    }

    void makeSound(){
        System.out.println("The dog barks");
    }

    public void eat(){
        System.out.println("The dog eats kibble");
    }

    public static void main(String[] args) {
        Animal myDog= new Dog("Karabas");
        myDog.makeSound();

        System.out.println(myDog.name);

        myDog.eat();

        makeAnimalEat(myDog);
    }

}
