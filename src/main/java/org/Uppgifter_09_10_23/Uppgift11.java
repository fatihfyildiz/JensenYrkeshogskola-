package org.Uppgifter_09_10_23;

public class Uppgift11 {

    public static void main(String[] args) {
        int tid = 0;
        int veckodag = 0;


        if (veckodag>=5){
            System.out.println("Helg");
        }else {
            if (tid>8 && tid <17){
                System.out.println("Arbetsdag");
            } else if(tid>=17 && tid < 24){
                System.out.println("Kväll");
            }
        }

    }

}
