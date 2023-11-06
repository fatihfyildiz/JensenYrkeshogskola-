package org.example.Lektion3_if_else;

import java.util.Scanner;

public class Övning_Lektion3_Arbetstid {

    public static void main(String[] args) {

        // Arbetstid: Givet en tid på dygnet, avgör om det är "arbetsdag", "kväll", eller
        // "helg" baserat på en arbetsvecka du definierar.

        // Working hours: Given a time of day, determine whether it is "workday", "evening", or
        // "weekend" based on a workweek you define.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day/ Ange dag");

        String day= scanner.nextLine();
        String dagKontrolt= day.toLowerCase();

        System.out.println("Enter the time / Ange tid");
        int tid= scanner.nextInt();

        switch (dagKontrolt){
            case "måndag":
            case "tisdag":
            case "onsdag":
            case "torsdag":
            case "fredag":
                System.out.println("Today is working day / Idag är arbetsdag");
                if (tid>8 && tid<17){
                    System.out.println("It is working time / Det är arbetstid");
                } else if (tid>17 && tid<23) {
                    System.out.println("It is evening, you can rest / Det är kväll, du kan vila");
                } else{
                    System.out.println("You can sleep / Du kan sova");
                }
                break;

            case "lördag":
            case "söndag":
                System.out.println("Today is the weekend / Idag är det helg");
                if (tid>9 && tid<17){
                    System.out.println("It is time to relax / Det är dags att koppla av");
                } else if (tid>17 && tid<23) {
                    System.out.println("It is evening, you can rest / Det är kväll, du kan vila");
                } else{
                    System.out.println("You can sleep / Du kan sova");
                }
        }

        scanner.close();
    }
}
