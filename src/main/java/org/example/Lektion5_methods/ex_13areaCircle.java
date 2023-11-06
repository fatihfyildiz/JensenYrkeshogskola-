package org.example.Lektion5_methods;

public class ex_13areaCircle {
    public static void main(String[] args) {

        // Create a method that takes in the radius of a circle
        // and returns the area of the circle. Use the formula: area = π * r^2.

        System.out.println("The area of your circle is " + circleArea(1.5));
    }

    public static double circleArea (double radius){ // double sonuc verecegi icin void yazamayiz, dobule tanimlamaliyiz

        double area= 3.14*radius*radius;

        return area;
    }
}
