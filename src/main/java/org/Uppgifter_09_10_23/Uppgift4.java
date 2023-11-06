package org.Uppgifter_09_10_23;

public class Uppgift4 {

    public static void main(String[] args) {

        int a = 40;
        int b = 2;
        int c = 100;

        /*

        if (a>b && a>c){
            System.out.println(a);
        } else if (b>c&&b>a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
*/

        System.out.println(Math.max(Math.max(a,b),c));


    }

}
