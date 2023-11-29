package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C05_ShiftElementsRight_2 {

    public static void main(String[] args) {
        // Create a method that will shift all the elements of a given array to the right,
        // move the last element to the beginning, and save the array in its new form.

        int[] arr= {4,6,1,3,7};

        arr = shiftToRight(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static int[] shiftToRight(int[] arr) {

        int temp= arr[arr.length-1];   // Assigning the last element into a temporary variable as temp

        for (int i = arr.length-1; i >0; i--) {   // Shifting the elements to right
            // Starting from the last element and coming to the first by i--

            arr[i]=arr[i-1];
        }
        arr[0]=temp; // Assigning the temporary variable to the first element as index 0

        return arr;
    }

}
