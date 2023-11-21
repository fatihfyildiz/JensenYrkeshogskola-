package org.example.JUnit_Lektioner9_10.Lektion10_15_11_23;

public class TextUtility {

    public boolean isPalindrome (String str){

        String formattedString= str.replaceAll("[^a-zA-Z0-9]"," ");
        formattedString = formattedString.replaceAll(" ","");
        // instead of the two code rows above, we can use just a one code row as below:
        // String formattedString= str.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder stringBuilder= new StringBuilder(formattedString);
        String reversed = stringBuilder.reverse().toString();

        if (reversed.toLowerCase().equals(formattedString.toLowerCase())){
            return true;
        } else {
            return false;
        }

    }
}
