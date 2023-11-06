package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class PrimTal_PrimeNumber {

    public static void main(String[] args) {

    // Primtalskontroll: För alla tal från 1 till N, kontrollera om talet är ett primtal och skriv ut det.
    // Prime number check: For all numbers from 1 to N, check if the number is prime and print it.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a positive integer number");

        int tal= scanner.nextInt();

        for (int i = 2; i < tal; i++) {
            if (tal%i != 0){
                System.out.println("It is a prime number");
                break;
            } else if (tal%i == 0){
                System.out.println("It is NOT a prime number");
                break;
            }
        }

        scanner.close();
    }
}
