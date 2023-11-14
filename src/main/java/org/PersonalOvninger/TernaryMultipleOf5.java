package org.PersonalOvninger;

import java.util.Scanner;

public class TernaryMultipleOf5 {
    public static void main(String[] args) {

        // Get an integer from the user and print "Multiple of 5" if it's divisible by 5,
        // otherwise print as "not a multiple of 5"

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an integer");
        int number= scanner.nextInt();

        System.out.println(number %5 == 0 ? "Multiple of 5" : "NOT multiple of 5");

        scanner.close();
    }
}
