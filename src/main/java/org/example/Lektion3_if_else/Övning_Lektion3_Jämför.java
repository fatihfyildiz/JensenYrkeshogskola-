package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_Jämför {

    public static void main(String[] args) {

    // Jämförelse av Två Tal: Skriv ett program som jämför två tal och skriver ut vilket som är störst.
    // Comparison of Two Numbers: Write a program that compares two numbers and prints which is bigger.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter two numbers / Ange två tal");
        int tal1= scanner.nextInt();
        int tal2= scanner.nextInt();

        if (tal1>tal2) {
            System.out.println("The bigger number is / Det större talet är " + tal1);
        } else if (tal1<tal2) {
            System.out.println("The bigger number is / Det större talet är " + tal2);
        } else {
            System.out.println("Those numbers are equal to each other / Dessa tal är lika med varandra");
        }

        scanner.close();
    }
}
