package com.kodilla.good.patterns.food2door;

public class User {

    private String surname;
    private String name;

    public User(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User: " +
                surname + " " +
                 name;
    }
}
