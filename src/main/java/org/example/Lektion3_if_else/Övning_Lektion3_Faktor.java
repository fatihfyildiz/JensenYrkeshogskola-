package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_Faktor {
    public static void main(String[] args) {

        // Faktor av Tal: Kontrollera om ett tal är en faktor till ett annat.
        // Factor of Number: Check if one number is a factor of another.

        System.out.println("Enter two different numbers / Ange två olika tal");
        Scanner scanner= new Scanner(System.in);

        int tal1= scanner.nextInt();
        int tal2= scanner.nextInt();

        if (tal1 % tal2 == 0) {
            System.out.println(tal2+ " is the factorial of / är faktorn för " +tal1);
        } else if (tal2 % tal1 == 0) {
            System.out.println(tal1+ " is the factorial of / är faktorn för " +tal2);
        } else {
            System.out.println("There is no factorial relationship / Det finns inget faktoriellt samband");
        }

        scanner.close();

    }
}
