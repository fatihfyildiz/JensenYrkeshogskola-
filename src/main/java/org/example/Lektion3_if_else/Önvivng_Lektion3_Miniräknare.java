package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Önvivng_Lektion3_Miniräknare {

    public static void main(String[] args) {

        // Miniräknare: Skapa en enkel miniräknare som utför en operation (+, -, *, /) beroende på vad användaren väljer.
        // Calculator: Create a simple calculator that performs an operation (+, -, *, /) depending on what the user chooses.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Choose operation type");
        String operation= scanner.nextLine();

        System.out.println("Enter two different numbers");
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if (operation.equals("+")){
            System.out.println(a+b);
        } else if (operation.equals("-")) {
            System.out.println(a-b);
        } else if (operation.equals("*")) {
            System.out.println(a*b);
        } else if (operation.equals("/")) {
            System.out.println(a/b);
        } else {
            System.out.println("Invalid entered operation");
        }

        scanner.close();
    }
}
