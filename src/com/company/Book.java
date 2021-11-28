package com.company;

public class Book {
    String author;
    int pages;
    int year;
    User user;

    Book(String author,int pages,int year,User user){
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.user = user;
    }
}
