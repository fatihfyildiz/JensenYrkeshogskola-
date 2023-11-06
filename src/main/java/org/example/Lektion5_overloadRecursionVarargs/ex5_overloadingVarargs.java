package org.example.Lektion5_overloadRecursionVarargs;

public class ex5_overloadingVarargs {
    public static void main(String[] args) {
        //  Create overlaid methods that print a list of elements.
        //  One method should handle a list of integers and the other a list of strings.

        printList(1,2,3,4,7,8,9,0,66);
        System.out.println(" ");
        printList("hej","mig","sager", "hejdå");

    }

    public static void printList(int... numberList){

        for (int i=0; i<numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }
    }

    public static void printList(String... wordList){

        for (int i=0; i<wordList.length; i++) {

            System.out.println(wordList[i] + " ");
        }
    }


}
