package org.PersonalOvninger;

import java.util.Scanner;

public class MonthFirstLetter {
    public static void main(String[] args) {

        // Get a letter from the user, if there is a month starting with the letter, print it.
        // NOTE: There should be no uppercase or lowercase sensitivity.
        // When the user types f or F, the output is February

        System.out.println("Please enter a letter");
        Scanner scanner= new Scanner(System.in);

        String letter= scanner.nextLine().toUpperCase();

        if (letter.equals("J")){
            System.out.println("January, June or July");
        } else if (letter.equals("F")) {
            System.out.println("February");
        } else if (letter.equals("M")) {
            System.out.println("March or May");
        } else if (letter.equals("A")) {
            System.out.println("April or August");
        } else if (letter.equals("S")) {
            System.out.println("September");
        } else if (letter.equals("O")) {
            System.out.println("October");
        } else if (letter.equals("N")){
            System.out.println("November");
        } else if (letter.equals("D")) {
            System.out.println("December");
        } else {
            System.out.println("There is no month starting with the entered letter");
        }

        scanner.close();

    }
}
