package org.example.Lektion5_methods;

public class ex3_returnSumValue {
    public static void main(String[] args) {
        // Create a method that returns the sum of two integers.

        sumInteger(5,8);
    }

    public static void sumInteger(int a, int b){ // void olursa return yazmaya gerek yok, kendisi yapiyor zaten

        System.out.println(a+b);
    }
}
