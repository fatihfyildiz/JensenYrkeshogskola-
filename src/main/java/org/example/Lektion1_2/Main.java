package org.example.Lektion1_2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Hello world!");

        System.out.println("Hej");

        String namn = "Fatih";

        System.out.println("Hejsan, mitt namn är " + namn);

        int a = 5;
        int b = 9;

        a++;
        b--;

        System.out.println(a);
        System.out.println(b);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String name = scanner.nextLine();
        System.out.println("Hej " + name);


        boolean value = true;

        if (value) {
            System.out.println("Hejsan");

        for (int i =1; i<=10; i++){
            System.out.println(i);

        int a = 0;

        while (a < 10) {
            System.out.println("Hejsan");
            a++;

        }

        */

        /*
        public static void sayHello (int a, int b) {
            System.out.println(a);
            System.out.println(b);
        }

         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lämna in ett nummer");

        int data = scanner.nextInt();

        if (data > 0) {
            System.out.println("Du skrev " + data + " och det är positiv" );
        } else if (data < 0) {
            System.out.println("Du skrev " + data + " och det är negativ" );
        } else {
            System.out.println("Du skrev " + data + " och det är noll" );
        }



        int sum = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Skriv ett tal");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            sum = sum + number; // istället vi kan skriva som ==> sum += number
        }

        System.out.println(sum);

        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++){
            int randomNumber = random.nextInt(0,10);
                sum += randomNumber;
            System.out.println(randomNumber);
        }
        System.out.println(sum);

        /*

        Random random = new Random();

        int tal = random.nextInt(0,10);

        while (true) {
            Scanner scanner= new Scanner(System.in);

            int gissning = scanner.nextInt();

            if (gissning==tal){
                System.out.println("Det var rätt");
                return;
            } else {
                System.out.println("Det var fel");
            }

        }

        */

    }

}

