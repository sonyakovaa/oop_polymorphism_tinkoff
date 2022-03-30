package ru.tinkoff.fintech;

public class Book {
    private final String name;
    private final String author;
    private int serialNum = 0;
    private int pageCount = 0;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int serialNum, int pageCount) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
        this.pageCount = pageCount;
    }

    public Book(String name, String author, int serialNum) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title of the book - " + name +
                ", author - " + author +
                ", serial number in the series - " + serialNum +
                ", number of pages - " + pageCount;
    }
}
