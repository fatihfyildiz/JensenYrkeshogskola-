package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_StörstAvTre {
    public static void main(String[] args) {

    // Störst av Tre: Skriv ett program som tar emot tre tal och skriver ut det största.
    // Largest of Three: Write a program that accepts three numbers and prints the largest.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter three different numbers / Ange tre olika nummer");

        int nummer1= scanner.nextInt();
        int nummer2= scanner.nextInt();
        int nummer3= scanner.nextInt();

        if(nummer1 >= nummer2 & nummer1 >= nummer3){
            System.out.println("The biggest one is " + nummer1);
        } else if (nummer2 >= nummer1 & nummer2 >= nummer3) {
            System.out.println("The biggest one is " + nummer2);
        } else {
            System.out.println("The biggest one is " + nummer3);
        }

        scanner.close();
    }
}
