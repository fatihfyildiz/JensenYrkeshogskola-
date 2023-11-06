package org.example.Lektion5_overloadRecursionVarargs;

import java.util.Scanner;

public class ex6_recursivePalindrome {
    public static void main(String[] args) {
        // Recursive palindrome check: Create a recursive method that checks if a given string is a palindrome.

        System.out.println(isPalindrome("megem"));

    }

   /*
    public static void ispalindroma(String ord){

        String reversed = "";

        for (int i = ord.length()-1; i >= 0; i--) {

            reversed += ord.charAt(i);
        }

        if (ord.equals(reversed)){
            System.out.println("It is a polindrome");
        } else {
            System.out.println("It is NOT a polindrome");
        }
    }
    */

    public static boolean isPalindrome(String text){

        if (text.length() == 0 || text.length()==1) {
            return true;
        }

        char first= text.charAt(0);
        char last= text.charAt(text.length()-1);

        if (first==last){
            if (isPalindrome(text.substring(1,text.length()-1)));
            return true;
        } else {
            return false;
        }

    }

}
