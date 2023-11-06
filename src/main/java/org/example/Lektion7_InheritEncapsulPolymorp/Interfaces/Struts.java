package org.example.Lektion7_InheritEncapsulPolymorp.Interfaces;

public class Struts implements Singable{
    @Override
    public void sing() {
        System.out.println("Pip");
    }

    public static void main(String[] args) {
        Bird myBird= new Bird("Kartal");

    }
}
