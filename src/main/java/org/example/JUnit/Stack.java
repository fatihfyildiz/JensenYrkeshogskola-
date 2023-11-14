package org.example.JUnit;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<String> list = new ArrayList<>();

    public void push(String str){
        list.add(0,str);
    }
    public String pop(){

        if (list.size()>0){
            String value = list.remove(0);
            return value;
        }else {
            return null;
        }

    }

}



