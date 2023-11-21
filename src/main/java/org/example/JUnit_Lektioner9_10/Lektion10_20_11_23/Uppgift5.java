package org.example.JUnit_Lektioner9_10.Lektion10_20_11_23;

import java.io.BufferedReader;
import java.io.FileReader;

public class Uppgift5 {
    public static void main(String[] args) {
        System.out.println(get_lines("practice.txt"));

    }

    public static int get_lines (String path) {

        int lines = 0;

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.readLine() != null) {
                lines++;
            }


        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        return lines;
    }
}
