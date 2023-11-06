package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_TriangelnsTyp {
    public static void main(String[] args) {

        // Triangelns Typ: Givet tre sidor, avgör om en triangel är liksidig, likbent, eller oliksidig.
        // Triangle's Type: Given three sides, determine if a triangle is equilateral, isosceles, or scalene

        System.out.println("Enter three sides (bigger than 0) of a triangle / Ange tre sidor (större än 0) av en triangel");

        Scanner scanner= new Scanner(System.in);
        int sida1= scanner.nextInt();
        int sida2= scanner.nextInt();
        int sida3= scanner.nextInt();

        if ((sida1+sida2>sida3) && (sida1+sida3>sida2) && (sida2+sida3>sida1)) {
            if (sida1 == sida2 & sida1 == sida3){
                System.out.println("This triangle is equilateral / Denna triangel är liksidig");
            } else if (sida1 == sida2 || sida1 == sida3 || sida2 == sida3) {
                System.out.println("This triangle is isosceles / Denna triangel är likbent");
            } else {
                System.out.println("This triangle is scalene / Denna triangel är oliksidig");
            }
        } else {
            System.out.println("These sides do NOT form a triangle / Dessa sidor bildar INTE en triangel");
        }

        scanner.close();
            
    }


}
