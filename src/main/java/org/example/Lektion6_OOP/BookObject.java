package org.example.Lektion6_OOP;

public class BookObject {

    public static void main(String[] args) {

        Book myBook = new Book("1984","George Orwell");

        myBook.showInfo();

        Book favoriteBook = new Book("Oliver Twist", "Charles Dickens");

        myBook.setAuthor("William Shakespeare");

        myBook.setTitle("Romeo och Juliet");

        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());


    }

}
