package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_Lösenord {

    public static void main(String[] args) {

        // Lösenordskontroll: Skapa ett program där användaren ska skriva in ett lösenord och
        // kontrollera om det matchar ett förbestämt lösenord.

        // Password Checker: Create a program where the user has to enter a password and
        // check if it matches a predetermined password.

        String lösenOrd= "Open123+Door";

        System.out.println("Enter the password / Ange lösenordet");
        Scanner scanner= new Scanner(System.in);

        String angettLösenord= scanner.nextLine();

        if (lösenOrd.equals(angettLösenord)){
            System.out.println("Welcome / Välkommen");
        } else {
            System.out.println("Wrong password, try again / Fel lösenord, försök igen");
        }
        scanner.close();
    }
}
