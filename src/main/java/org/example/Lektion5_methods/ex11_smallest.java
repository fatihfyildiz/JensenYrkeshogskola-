package org.example.Lektion5_methods;

public class ex11_smallest {
    public static void main(String[] args) {
        // Create a method that takes in three integers and returns the smallest of them.

        smallest(6,5,7);
    }

    public static void smallest(int a, int b, int c){ // void yerine int yazip sout'da da return a (veya b, c) yazabiliriz

        if(a<b && a<c){
            System.out.println(a);
        } else if (b<a && b<c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
