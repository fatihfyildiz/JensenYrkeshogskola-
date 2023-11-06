package org.Uppgifter_09_10_23;

import java.util.Scanner;

public class Uppgift7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String enteredPassword = scanner.nextLine();

        String correctPassword = "123";

        if (enteredPassword.equals(correctPassword)){
            System.out.println("Det var rätt lösenord");
        }else {
            System.out.println("Fel lösenord");
        }

        scanner.close();
    }

}
