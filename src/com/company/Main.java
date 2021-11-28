package com.company;

public class Main {

    public static void main(String[] args) {

        User tima = new User("email-frost","TI","YU");
        System.out.println(tima);
        System.out.println("Пользователей онлайн - " + User.totalOnline);
        User yarik = new User("email-yarik","YA","MA");
        System.out.println("Пользователей онлайн - " + User.totalOnline);
        Author author = new Author("Ярослав", "Мартынов", 5, "Королев", yarik);
        System.out.println(author);
        // write your code here
    }
}
