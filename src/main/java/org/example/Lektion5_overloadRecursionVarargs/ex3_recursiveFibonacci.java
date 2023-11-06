package org.example.Lektion5_overloadRecursionVarargs;

public class ex3_recursiveFibonacci {
    public static void main(String[] args) {
    // Recursive Fibonacci: Create a method that calculates the nth Fibonacci number using recursion.

        int fib= fibonacci(4);
        System.out.println(fib);

        // asagidaki for-loop extra'dan yazdigimiz bir sey, soru cozumu degil, sadece seriyi görmek icin
        for (int i = 0; i <= 4; i++) {
            int fib2=fibonacci(i);
            System.out.print(" " + fib2);
        }
    }

    public static int fibonacci (int n){

        if (n==0) {
            return 0;
        } else if (n==1){
            return 1;
        }

        return fibonacci(n-2)+fibonacci(n-1);
    }
}
