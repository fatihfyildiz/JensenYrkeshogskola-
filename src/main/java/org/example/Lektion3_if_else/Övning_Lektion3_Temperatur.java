package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_Temperatur {
    public static void main(String[] args) {

        // Temperaturkontroll: Givet en temperatur, skriv ut om det är "varmt",
        // "kallt" eller "måttligt" (du bestämmer temperaturintervallen)

        // Temperature control: Given a temperature, print if it's "hot",
        // "cold" or "moderate" (you decide the temperature ranges).

        System.out.println("What is the temperature today? / Vad är temperaturen idag?");

        Scanner scanner= new Scanner(System.in);

        int temp= scanner.nextInt();

        if (temp > 18){
            System.out.println("Today is hot / Idag är varmt");
        } else if (temp >0) {
            System.out.println("Today is moderate / Idag är måttligt");
        } else{
            System.out.println("Today is cold / Idag är kallt");
        }

        scanner.close();
    }
}
