package org.example.Lektion3_while_doWhile;

import java.util.Scanner;

public class Ränta_Interest {

    public static void main(String[] args) {

        // Ränta på Sparkonto:
        // Beräkna hur många år det tar för ett visst belopp att nå en önskad summa
        // med en fast årlig ränta, använd en while -loop.

        // Interest on Savings account:
        // Calculate how many years it will take for a certain amount to reach a desired sum
        // with a fixed annual interest rate, using a while - loop.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the initial amount: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the desired sum: ");
        double desiredSum = scanner.nextDouble();

        int years=0;
        double currentAmount=initialAmount;

        while (currentAmount < desiredSum){

            currentAmount += currentAmount * annualInterestRate;
            years++;
        }

        System.out.println("It will take " + years + " years to reach the desired sum of SEK" + desiredSum);

        scanner.close();

    }
}
