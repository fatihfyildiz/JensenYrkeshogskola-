package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class RäknaTillN_CountToN {
    public static void main(String[] args) {
        // Skriv ett program som räknar från 1 till ett nummer N som användaren matar in.
        // Write a program that counts from 1 to a number N that the user inputs.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N): ");

        int N = scanner.nextInt();

        if (N < 1) { // Check if N is non-negative
            System.out.println("Please enter a positive number.");
            return; // Exit the program
        }

        System.out.println("Counting from 1 to " + N + ":");

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Print a newline to separate the output


    }
}
