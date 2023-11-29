package org.example.PersonalTrainingArray;

public class C07_SearchElementHowMany_2 {

    public static void main(String[] args) {

        // Create a method that prints whether a desired element exists in a given array and how many times it is used.

        String[] arr= {"A","G","F","A","K","F","F"};

        String searchedElement="A";

        ifExistHowMany(arr,searchedElement);

    }


    public static void ifExistHowMany(String[] arr, String searchedElement) {

        int count=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(searchedElement)){
                count++;
            }
        }

        if (count==0){
            System.out.println("The searched element does NOT exist");

        } else {
            System.out.println("Searched element " + searchedElement + " exists" + count + " times in the given array");
        }
    }

}
