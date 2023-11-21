package org.example.SQL.Lektion10_20_11_23;

import java.io.File;

public class FileCreating {

    public static void main(String[] args) {

        File myFile = new File("example.txt");

        System.out.println(myFile.exists());

    }
}