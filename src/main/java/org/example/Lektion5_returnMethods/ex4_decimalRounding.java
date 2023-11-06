package org.example.Lektion5_returnMethods;

public class ex4_decimalRounding {
    public static void main(String[] args) {
        // Create a method that takes in a decimal number and returns it rounded to the nearest integer.

        System.out.println(decimalRound(5.384));
    }

    public static double decimalRound(double number){

        return (int) Math.round(number);

    }
}
