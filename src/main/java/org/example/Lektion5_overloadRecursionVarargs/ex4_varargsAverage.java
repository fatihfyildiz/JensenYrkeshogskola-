package org.example.Lektion5_overloadRecursionVarargs;

public class ex4_varargsAverage {
    public static void main(String[] args) {
        //Create a method that takes an indefinite number of integers as arguments and returns their average

        double avg= getAverage(1,2,3,4);
        System.out.println(avg);
    }

    public static double getAverage(int ...numbers){

        int sum= 0;

        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i];
        }

        return (double)sum / numbers.length; // yukarida int olarak yazinca tamsayi cikacak bu nedenle double"a cast ettik

    }

}
