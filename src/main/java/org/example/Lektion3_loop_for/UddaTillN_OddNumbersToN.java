package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class UddaTillN_OddNumbersToN {
    public static void main(String[] args) {
        // Skriv ut alla udda tal från 1 till N.
        // Print all odd numbers from 1 to N.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();


        if (N < 1) {  // Check if N is non-negative
            System.out.println("Please enter a positive number.");
            return; // Exit the program
        }

        System.out.println("Odd numbers from 1 to " + N + ":");

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Print a newline to separate the output

        scanner.close();


    }
}
