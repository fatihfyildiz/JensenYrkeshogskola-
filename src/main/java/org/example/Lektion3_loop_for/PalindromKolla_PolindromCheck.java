package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class PalindromKolla_PolindromCheck {

    public static void main(String[] args) {

        // Palindromkontroll: Kontrollera om en inmatad sträng är en palindrom.
        // Palindrome check: Check if an input string is a palindrome.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a String");

        String original = scanner.nextLine().toLowerCase(); // ignoring Uppercase letters
        String reversed = "";

        for (int i = original.length()-1; i >= 0; i--) {

            reversed += original.charAt(i);
        }

        if (original.equals(reversed)){
            System.out.println("It is a polindrome");
        } else {
            System.out.println("It is NOT a polindrome");
        }


    }
}
