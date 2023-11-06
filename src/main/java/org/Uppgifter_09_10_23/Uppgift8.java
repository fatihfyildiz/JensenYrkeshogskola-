package org.Uppgifter_09_10_23;

public class Uppgift8 {

    public static void main(String[] args) {

        int månad = 11;

        if (månad<3 || månad >= 11){
            System.out.println("Vinter");
        } else if(månad > 3 && månad < 6){
            System.out.println("Vår");
        } else if (månad >= 6 && månad < 9){
            System.out.println("Sommar");
        } else if(månad >= 9 && månad < 11){
            System.out.println("Höst");
        }


    }

}
