package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C03_AddingToEachElement_3 {

    public static void main(String[] args) {

        // Create a method that increases all elements of a given int array by 2 and returns it to us.
        // Save the old array with the new elements.

        System.out.println("The old array now becomes: " + newArray());

    }


    public static String newArray(){

        int [] oldArray = {1,2,3,4,5};

        for(int i=0; i<oldArray.length; i++){
            oldArray[i]+=2;
        }
        return Arrays.toString(oldArray);

    }

}
