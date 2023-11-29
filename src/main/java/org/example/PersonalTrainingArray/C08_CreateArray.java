package org.example.PersonalTrainingArray;

import java.util.Arrays;
import java.util.Scanner;

public class C08_CreateArray {

    public static void main(String[] args) {

        // Create a method that takes the size and elements of the array from the user,
        // then creates the array and returns it to us.

        int [] arr= createArray();

        System.out.println(Arrays.toString(arr));
    }

    public static int[] createArray() {

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter the length of the array to be created");
        int length= scan.nextInt();

        int[] arr= new int[length];

        for (int i = 0; i < length; i++) {

            System.out.println(i +" .th index element should be entered as");
            arr[i]= scan.nextInt();
        }
        return arr;
    }
}
