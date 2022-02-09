package com.ntnu.library;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Author (int initId, String initFirstName, String initLastName, int initBirthYear) {
        setId(initId);
        setFirstName(initFirstName);
        setLastName(initLastName);
        setBirthYear(initBirthYear);
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setBirthYear(int newBirthYear) {
        birthYear = newBirthYear;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
