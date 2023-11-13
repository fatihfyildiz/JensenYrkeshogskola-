package org.PersonalOvninger;

import java.util.Scanner;

public class LowerUpperCasesByChar {
    public static void main(String[] args) {
        // Ask the user for a letter, if the entered character is a lowercase letter,
        // print it as an uppercase letter, otherwise print the entered letter.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character");

        char enteredCharacter=scanner.next().charAt(0);

        if(enteredCharacter>='a' && enteredCharacter<='z'){
            System.out.println((char)(enteredCharacter-32)); // By casting, we provide letter instead of a number
                                                            // since we see number when using -32
        } else if (enteredCharacter>='A' && enteredCharacter<='Z') {
            System.out.println(enteredCharacter);
        } else {
            System.out.println("Invalid character, not a letter");
        }

        scanner.close();

    }
}
