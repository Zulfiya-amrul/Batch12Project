package com.syntax.class19;

public class Book {
    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String bookName;
    String authorName;
    int numberPages;

    public Book(String bookName, String authorName, int numberPages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberPages = numberPages;
        System.out.println(bookName +  " " + authorName + " " + numberPages);
        System.out.println("this is first constructor");
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
        System.out.println(bookName +  " " + authorName);
        System.out.println("this is second constructor");

    }

}
