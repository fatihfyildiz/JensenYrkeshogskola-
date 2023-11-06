package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class SammanAvSeries_SumOfSeries {
    public static void main(String[] args) {

        // Beräkna summan av serien 1 + 1/2 + 1/3 + ... + 1/N där N matas in av användaren.
        // Calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/N where N is entered by the user.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a positive number");
        int number= scanner.nextInt();

        double sum=0;

        for (double i = 1; i <= number; i++) {
            sum += 1/i;
        }

        System.out.println("Sum of the series is " +sum);

        scanner.close();
    }
}
