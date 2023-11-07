package org.example.Lektion3_switchIF;

import java.util.Scanner;

public class WeekdaysSwitch {

    // Skriv ett program som omvandlar ett nummer (1-7) till motsvarande dag i veckan med en switch-sats.
    // Write a program that converts a number (1-7) to the corresponding day of the week using a switch statement.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a digit between 1 and 7, including 1 & 7");

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Invalid day!");


        }

    }
}
