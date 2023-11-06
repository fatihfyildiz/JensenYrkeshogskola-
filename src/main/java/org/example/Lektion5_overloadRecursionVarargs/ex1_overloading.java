package org.example.Lektion5_overloadRecursionVarargs;

public class ex1_overloading {
    public static void main(String[] args) {
        /*
        Create three methods with the name calculateArea.
        The first should count the area of a circle by one given radius,
        the second for a rectangle with given length and width,
        and the third for a triangle with given base and height
         */

        System.out.println(calculateArea(3));
        System.out.println(calculateArea(4, 5));
        System.out.println(calculateArea(4, 6, true));

    }

    public static double calculateArea(double r){

        /*
        double area= 3.14*r*r;

        return area;

        VEYA
         */

        return Math.PI*r*r;

    }

    public static double calculateArea(double l, double h){


        return l*h;
    }

    public static double calculateArea(double l, double h, boolean isTriangle){

        return l*h/2;
    }

}
