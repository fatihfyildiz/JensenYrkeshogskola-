package org.Uppgifter_09_10_23;

import java.util.Scanner;

public class Upgift13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hej = 5;

        String operation = scanner.nextLine();

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (operation.equals("+")){
            System.out.println(a+b);
        } else if(operation.equals("-")){
            System.out.println(a-b);
        } else if(operation.equals("*")){
            System.out.println(a*b);
        } else if(operation.equals("/")){
            System.out.println(a/b);
        } else {
            System.out.println("Invalid operator");
        }

    }


}
