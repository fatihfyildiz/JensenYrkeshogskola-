package org.PersonalOvninger;

import java.util.Scanner;

public class IfDividedBy5 {

    public static void main(String[] args) {

        // Ask the user for a number, check the number and
        // print “The number is an exact multiple of 5” if it is divisible by 5.

        System.out.println("Please enter an integer number");

        Scanner scanner= new Scanner(System.in);

        int number= scanner.nextInt();

        if (number %5 ==0){
            System.out.println("The number is an exact multiple of 5");
        } else {
            System.out.println("The number is NOT an exact multiple of 5");
        }

        scanner.close();
    }
}
