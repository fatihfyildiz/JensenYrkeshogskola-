package org.example.Lektion6_OOP;

public class Phone {
    String model;
    String branch;
    public void call(){
        System.out.println(model+ "is calling...");
    }
    public Phone (String branch,String model){
        this.branch= branch;
        this.model = model;
        if(model.contains("null")){
            this.model="unknown";
        }
    }
    public void charge(){
        System.out.println(branch+ "is charging...");
    }



}
