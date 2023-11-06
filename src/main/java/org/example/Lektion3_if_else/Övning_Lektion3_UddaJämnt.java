package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_UddaJämnt {
    public static void main(String[] args) {

        // Udda eller Jämnt: Skriv ett program som kontrollerar om ett tal är udda eller jämnt
        // Odd or Even: Write a program that checks whether a number is odd or even
        Scanner scanner= new Scanner(System.in);

        int nummer = scanner.nextInt();

        if (nummer % 2 == 0 || nummer == 0) {
            System.out.println("Angivet nummer är jämnt");
        } else {
            System.out.println("Angivet nummer är udda");
        }

        scanner.close();
    }
}
