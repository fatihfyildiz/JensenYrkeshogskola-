package org.PersonalOvninger;

public class StringManipulations {
    public static void main(String[] args) {

        String str= "Jag heter Fatih och jag pratar på svenska";

        System.out.println(str.length()); // 41

        System.out.println(str.substring(27)); // tar på svenska

        System.out.println(str.charAt(str.length()-9)); // å

        System.out.println(str.substring(str.length()-9)); // å svenska

        System.out.println(str.substring(29,38)); // r på sven
        // The above print part includes the 29th (beginIndex) but excludes the 38th (endIndex) letter


    }
}
