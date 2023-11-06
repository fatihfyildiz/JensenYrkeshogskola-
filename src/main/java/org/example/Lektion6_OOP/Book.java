package org.example.Lektion6_OOP;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;

    public void showInfo(){

        System.out.println("The books title is: " + title + " and the books author is : " + author);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Book book1= new Book("Jakob", "Jakons äventyr");
        Book book2= new Book("Kalle", "Kalles äventyr");
        Book book3= new Book("Lisa", "Lisas äventyr");

    }

}
