package org.example.Lektion3_switchIF;

import java.util.Scanner;

public class DaysMonth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the month: ");
        String month = scanner.nextLine();

        int days;

        switch (month.toLowerCase()) { // Handling both the uppercase and lowercase versions of month names
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                days = 28; // Assuming non-leap year by default
                break;
            default:
                System.out.println("Invalid month name");

            return; // Exiting the program
        }

        System.out.println("Number of days in " + month + " is " + days);

        scanner.close();
    }
}
