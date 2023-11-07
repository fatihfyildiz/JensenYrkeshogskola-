package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class FleraTabeller_SeveralTables {
    public static void main(String[] args) {

        // Flera Tabeller: Visa multiplikationstabellerna för de första N talen
        // Several Tables: Display the multiplication tables for the first N numbers

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a positive integer number");

        int N= scanner.nextInt();

        for (int i = 0; i <=N; i++) {
            for (int j = 0; j <=N; j++) {

                System.out.println(i + "* " + j + " = " + i*j);

            }

        }

    }
}
