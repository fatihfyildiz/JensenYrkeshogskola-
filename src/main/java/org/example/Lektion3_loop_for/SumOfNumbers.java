package org.example.Lektion3_loop_for;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Skriv ett program som summerar alla tal från 1 till N
        // Write a program that sums all numbers from 1 to N

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a positive number");
        int number= scanner.nextInt();

        int sum=0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum of the series is : " + sum);

        scanner.close();


    }
}
