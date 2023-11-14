package org.example.JUnit;

public class Calculator {

    public int add(int a, int b){

        return a+b;
    }

    public int multiply (int a, int b){

        return a*b;
    }

    public static int division(int a, int b){

        if (b==0){ // for division med zero
            throw new ArithmeticException("Division by zero is not allowed");

        }
            return a / b;
        }

    public int substruction (int a, int b){

        return a-b;
    }

}
