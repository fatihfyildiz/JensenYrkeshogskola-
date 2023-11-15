package org.example.JUnit.Lektion10_15_11_23;

public class TextUtility {

    public boolean isPalindrome (String str){

        String formattedString= str.replaceAll("[^a-zA-Z0-9]"," ");
        formattedString = formattedString.replaceAll(" ","");
        StringBuilder stringBuilder= new StringBuilder();
        String reversed = stringBuilder.reverse().toString();

        if (reversed.toLowerCase().equals(formattedString.toLowerCase())){
            return true;
        } else {
            return false;
        }

    }
}
