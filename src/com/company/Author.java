package com.company;

public class Author {
    String name;
    String surname;
    int birthday;
    String country;
    User user;

    Author(String name, String surname, int birthday, String country, User user) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
        this.user = user;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", country='" + country + '\'' +
                ", user=" + user +
                '}';
    }
}
