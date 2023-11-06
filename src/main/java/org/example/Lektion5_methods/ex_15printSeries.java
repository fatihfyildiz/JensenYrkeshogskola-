package org.example.Lektion5_methods;

public class ex_15printSeries {
    public static void main(String[] args) {
        // Create a method that takes in an integer number and prints the
        // first natural numbers to that number

        printSeries(7);
    }

    public static void printSeries(int num){

        for (int i = 1; i <=num ; i++) {
            System.out.print(i + " "); // ==> if we sout by only print, it writes side by side
                                       // ==> if we sout by println, it writes down below
        }
    }
}
