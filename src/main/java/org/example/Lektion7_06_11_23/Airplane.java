package org.example.Lektion7_06_11_23;

public class Airplane implements Flyable{



    @Override
    public void fly() {
        System.out.println("The plane is flying");
    }

    public static void main(String[] args) {
        Airplane airplane= new Airplane();
        airplane.fly();

    }

}
