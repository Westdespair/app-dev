package com.ntnu.library;

public class Book {
    private int id;
    private String title;
    private int year;
    private int numberOfPages;

    public Book (int initId, String initTitle, int initYear, int initNumberOfPages) {
        setId(initId);
        setTitle(initTitle);
        setYear(initYear);
        setNumberOfPages(initNumberOfPages);
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setYear (int newYear) {
        year = newYear;
    }

    public void setNumberOfPages (int newNumberOfPages) {
        numberOfPages = newNumberOfPages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}