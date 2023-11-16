package org.PersonalOvninger;

import java.util.Scanner;

public class StringManipulations2 {

    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner scanner= new Scanner(System.in);
        String str= scanner.nextLine();

        System.out.println("Enter a word to search");
        String search= scanner.nextLine();

        System.out.println(str.indexOf(search)); // returns the index where the searched word starts
                                                 // OR returns -1 of not contains

        if (!str.contains(search)){
            System.out.println("Entered sentence doesn't contain the searched word");
        }

        int count= 0; // Before starting to count, it must set as zero in order to obtain the correct counting
        int index= str.indexOf(search);

        while (index != -1){ // this means that the searched word founds at least one time
            count++;         // increasing the count provides us the counting
            index = str.indexOf(search,index+1); // if earched word founds, new search starts the next index
        }

        System.out.println("word " + search + " is found " + count + " times in sentence of " + str);
        scanner.close();
    }
}
