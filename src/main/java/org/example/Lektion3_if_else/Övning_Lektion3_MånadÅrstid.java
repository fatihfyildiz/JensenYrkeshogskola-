package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_MånadÅrstid {

    public static void main(String[] args) {

        // Månad till Årstid: Användaren matar in en månad och programmet skriver ut vilken årstid det är.
        // Month to Season: The user enters a month and the program prints what season it is.

        System.out.println("Enter a month name / Ange ett månadsnamn");

        Scanner scanner= new Scanner(System.in);

        String angettMånad= scanner.next();
        String månad= angettMånad.toLowerCase();

        if (månad.equals("december") || månad.equals("januari") || månad.equals("februari")){
            System.out.println("The season is winter / Årstiden är vinter");
        } else if (månad.equals("mars") || månad.equals("april") || månad.equals("maj")) {
            System.out.println("The season is spring / Årstiden är vår");
        } else if (månad.equals("juni") || månad.equals("juli") || månad.equals("augusti")) {
            System.out.println("The season is summer / Årstiden är sommar");
        } else if (månad.equals("september") || månad.equals("october") || månad.equals("november")) {
            System.out.println("The season is autumn / Årstiden är höst");
        } else {
            System.out.println("Invalid month name, check and try again / Ogiltigt månadsnamn, kontrollera och försök igen");
        }

        scanner.close();
    }
}
