package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class BeräknaPotanser_CalculatePowers {

    public static void main(String[] args) {

        // Beräkna Potenser: För varje heltal x från 1 till N, skriv ut x^2 och x^3 .
        // Calculate Powers: For each integer from x 1 to N, print x^2 and x^3 .

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a positive number");
        int number= scanner.nextInt();

        int power1;
        int power2;
        int power3;

        for (int i = 1; i <= number; i++) {
            power1=i;
            power2=i*i;    // square = Math.pow(i,2)
            power3=i*i*i;  // cube = Math.pow(i,3)

            System.out.println("Powers of " + i + " are " + power1 + " " + power2 + " " + power3);

        }

        scanner.close();
    }
}
