package org.Uppgifter_09_10_23;

import java.util.Scanner;

public class Uppgift12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age  = scanner.nextInt();

        if (age<=18){
            System.out.println("Barn");
        } else if(age <= 60){
            System.out.println("Vuxen");
        } else {
            System.out.println("Pensionär");
        }

        scanner.close();
    }

}
