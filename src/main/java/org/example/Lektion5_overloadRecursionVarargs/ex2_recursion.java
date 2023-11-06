package org.example.Lektion5_overloadRecursionVarargs;

public class ex2_recursion {
    public static void main(String[] args) {
        // Countdown: Create a method that takes an integer
        //as a parameter and counts down to zero recursively

        count(10);
    }

    public static void count(int n){
        System.out.println(n);
        if (n>0){
            count(n-1);
        }

    }
}
