package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_Färgkodning {
    public static void main(String[] args) {

        //Färgkodning: Användaren matar in en färg (R, G, B, eller annan) och programmet ger en beskrivning av färgen
        //Color Coding: The user inputs a color (R, G, B, or other) and the program provides a description of the color

        Scanner scanner= new Scanner(System.in);

        String färg= scanner.nextLine().toUpperCase();

        if (färg.equals("R")){
            System.out.println("Red color");
        } else if (färg.equals("G")) {
            System.out.println("Green color");
        } else if (färg.equals("B")) {
            System.out.println("Blue color");
        } else {
            System.out.println("Other color OR invalid inout");
        }

        scanner.close();
    }
}
