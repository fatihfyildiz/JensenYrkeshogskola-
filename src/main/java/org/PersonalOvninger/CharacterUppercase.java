package org.PersonalOvninger;

import java.util.Scanner;

public class CharacterUppercase {
    public static void main(String[] args) {
        // Ask the user to enter a character, print whether the entered character is uppercase or not.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a character");

        char girilenKarakter=scanner.next().charAt(0);

        if(girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("Entered Character is an Uppercase Letter");
        } else if (girilenKarakter>='a' && girilenKarakter<='z') {
            System.out.println("Entered Character is a Lowercase Letter");
        } else {
            System.out.println("Invalid character, not a letter");
        }

        scanner.close();
    }
}
