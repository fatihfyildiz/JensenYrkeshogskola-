package org.example.Lektion5_methods;

public class ex12_methodInMethod {
    public static void main(String[] args) {

        // Calling a method from another method. Create a method A that calls method B.
        // And method B prints "called from method A"

        methodA();

    }

    public static void methodA(){
        methodB();
    }

    public static void methodB(){
        System.out.println("Called from method A");
    }
}
