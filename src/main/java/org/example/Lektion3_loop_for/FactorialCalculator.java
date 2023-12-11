package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Skriv ett program som räknar ut N!
        // Write a program that calculates N!

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        if (number < 0) { // Check if the number is non-negative
            System.out.println("Factorial is not defined for negative numbers.");
            return; // Exit the program
        }

        long factorial = 1; // using a long data type for the factorial variable
                            // for handling larger factorials that might exceed the range of int.

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);


    }
}
