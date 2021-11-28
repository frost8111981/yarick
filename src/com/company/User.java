package com.company;

public class User {
    String email;
    String name;
    String surname;
    static int totalOnline = 0;

    User(String email, String name, String surname) {
        this.name = name;
        this.email = email;
        this.surname = surname;
        totalOnline = totalOnline + 1;

    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
