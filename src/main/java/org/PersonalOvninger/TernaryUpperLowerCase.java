package org.PersonalOvninger;

import java.util.Scanner;

public class TernaryUpperLowerCase {

    public static void main(String[] args) {

        // Get a letter from the user and print it as a lower case if it's upper case
        // otherwise print it as itself

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a letter");

        char letter= scanner.next().charAt(0);

        System.out.println(letter >= 'A' && letter <='Z' ? (char)(letter+32) : letter);

        scanner.close();
    }
}
