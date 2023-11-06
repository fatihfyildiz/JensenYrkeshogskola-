package org.example.Lektion7_06_11_23;

public class Vehicle {

    public String registration;

    public void startEngine(){

        System.out.println("The vehicle is starting");
    }

    public static void main(String[] args) {
        Vehicle myCar= new Car();

        myCar.registration= "ABC-123";

        myCar.startEngine();

        System.out.println(myCar.registration);
    }

}
