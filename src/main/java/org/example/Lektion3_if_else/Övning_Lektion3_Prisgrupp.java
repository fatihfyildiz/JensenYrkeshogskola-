package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_Prisgrupp {
    public static void main(String[] args) {

        // Prisgrupp: Skriv ett program där användaren matar in sin ålder och
        // programmet avgör vilken prisgrupp användaren tillhör på biografen.

        // Price group: Write a program where the user enters their age and
        // the program determines which price group the user belongs to at the cinema.

        Scanner scanner= new Scanner(System.in);

        System.out.println("How old are you? / Hur gammal är du?");

        int ålder= scanner.nextInt();

        if(ålder<=18){
            System.out.println("Du är barn och betala bara 50 SEK");
        } else if (ålder<=65) {
            System.out.println("Du är vuxen och betala 150 SEK");
        } else {
            System.out.println("Du är pensionerad och betala 100 SEK");
        }

        scanner.close();

    }
}
