package org.example.Lektion5_returnMethods;

public class ex2_returnText {
    public static void main(String[] args) {
        // Create a method that takes in a string and an integer.
        // The method should return the string repeated the specified number of times.

        text("Hej",4);
    }

    public static String text(String ord, int num){

        for (int i = 1; i <= num ; i++) {
            System.out.println(ord);
        }
        return ord;
    }



}
