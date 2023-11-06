package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_RäknaPoäng {
    public static void main(String[] args) {

        // Räkna Poäng: Givet en poängsumma, konvertera den till ett betyg enligt ett system du bestämmer.
        // Calculate Points: Given a point total, convert it into a grade according to a system you decide.

        System.out.println("Enter your total point / Ange din poängsumma");

        Scanner scanner= new Scanner(System.in);

        int poäng= scanner.nextInt();

        if (poäng>=90) {
            System.out.println("Your grade is A / Ditt betyg är A");
        } else if (poäng>=80) {
            System.out.println("Your grade is B / Ditt betyg är B");
        } else if (poäng>=70) {
            System.out.println("Your grade is C / Ditt betyg är C");
        } else if (poäng>=60) {
            System.out.println("Your grade is D / Ditt betyg är D");
        } else if (poäng>=50) {
            System.out.println("Your grade is E / Ditt betyg är E");
        } else {
            System.out.println("Your grade is F, you are failed / Ditt betyg är F, du är inte godkänt");
        }

        scanner.close();
    }
}
