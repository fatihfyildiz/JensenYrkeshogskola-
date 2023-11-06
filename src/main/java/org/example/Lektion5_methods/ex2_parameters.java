package org.example.Lektion5_methods;

public class ex2_parameters {
    public static void main(String[] args) {
        // Create a method that takes your name as a parameter and prints "Hello, [Your Name]!".

        namnMethod("Fatih");
    }

    public static void namnMethod(String namn){
        System.out.println("Hello, " +namn+"!");
    }
}
