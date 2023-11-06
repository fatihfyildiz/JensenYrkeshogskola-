package org.Uppgifter_09_10_23;

public class Uppgift9 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        if (a==b&&a==c){
            System.out.println("Liksidig");
        }else if (a==b || a==c || b==c){
            System.out.println("Likbent");
        } else {
            System.out.println("Oliksidig");
        }

    }

}
