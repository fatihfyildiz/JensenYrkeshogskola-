package org.example.Lektion5_methods;

public class ex9_repetetion {
    public static void main(String[] args) {
        // Create a method that takes in a string and an integer and the method should print the specified string times.

        nTimes("Hejsan",3);
    }

    public static void nTimes(String ord, int n){

        for (int i = 1; i <=n ; i++) {
            System.out.println(ord);
        }

    }
}
