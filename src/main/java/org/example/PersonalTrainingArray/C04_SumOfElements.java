package org.example.PersonalTrainingArray;

public class C04_SumOfElements {

    public static void main(String[] args) {

        // Write a method that adds the positive integers in a given array and returns the result.

        int[] arr= {-3,-2,-1,0,1,4,5,9};

        System.out.println("The sum of the positive elements of the array is: " + sumElements(arr));


    }

    public static int sumElements(int[] arr){

        int result=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
                result +=arr[i];
        }

        return result;
    }



}
