package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_ÅlderKörkort {

    public static void main(String[] args) {

        // Ålder och Körkort: Skriv ett program som ber användaren om dess ålder och
        // skriver ut om användaren kan ta körkort i Sverige (18 år eller äldre).

        // Age and Driver's License: Write a program that asks the user for their age and
        // prints whether the user can get a driver's license in Sweden (18 years or older).

        Scanner scanner= new Scanner(System.in);

        System.out.println("How old are you? / Hur gammal är du?");

        int åld= scanner.nextInt();

        if (åld >= 18){
            System.out.println("You can get a Swedish driver's license / Du kan ta svenskt körkort");
        } else {
            System.out.println("You can NOT get a Swedish driver's license / Du kan INTE ta svenskt körkort");
        }

        scanner.close();
    }
}
