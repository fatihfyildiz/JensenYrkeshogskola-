package org.example.Lektion5_returnMethods;

public class ex3_returnMiddle {
    public static void main(String[] args) {
        // Create a method that takes in an integer. If the number is negative, print "Negative number" and exit the method.
        // Otherwise, print "Positive number".

        printNegative(2);
    }

    public static void printNegative (int num){
        if (num<0){
            System.out.println("Negative number");
            return;
        } else {
            System.out.println("Positive number");
        }
    }
}
