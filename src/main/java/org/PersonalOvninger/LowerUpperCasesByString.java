package org.PersonalOvninger;

import java.util.Scanner;

public class LowerUpperCasesByString {
    public static void main(String[] args) {
        // Ask the user for a letter, if the entered character is a lowercase letter,
        // print it as an uppercase letter, otherwise print the entered letter.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a character");

        String str = scanner.nextLine();

        String firstCharacter = str.substring(0, 1);
        
        if (firstCharacter.charAt(0) >= 97 && firstCharacter.charAt(0) <= 122) {
            System.out.println(firstCharacter.toUpperCase());
        } else if (firstCharacter.charAt(0) >= 65 && firstCharacter.charAt(0) <= 90) {
            System.out.println(firstCharacter);
        } else {
            System.out.println("Invalid character, not a letter");
        }

        scanner.close();
    }
}
