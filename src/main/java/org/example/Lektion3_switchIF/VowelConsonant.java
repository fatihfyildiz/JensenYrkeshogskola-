package org.example.Lektion3_switchIF;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        // Skriv ett program som kontrollerar om en inmatad bokstav är en vokal eller konsonant.
        // Write a program that checks whether an entered letter is a vowel or a consonant.

        String vokaler = "AEOUIÖÄÅY";

        System.out.println("Please enter a letter");

        Scanner scanner = new Scanner(System.in);

        String bokstav = scanner.nextLine().toUpperCase();

        if (vokaler.contains(bokstav)){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }

        scanner.close();
    }
}
