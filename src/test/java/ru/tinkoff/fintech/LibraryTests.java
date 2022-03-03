package ru.tinkoff.fintech;

import org.junit.jupiter.api.Test;
import ru.tinkoff.fintech.*;

public class LibraryTests {

    @Test
    public void choiceBookReturnValue() {
        Book[] books = {new Book("name", "author")};
        new Reader().choiceBook(books);
    }

    @Test
    public void choiceBookReturnRandom() {
        Book[] books = {new Book("1", "author"),
                new Book("2", "author"),
                new Book("3", "author"),
                new Book("4", "author")};

        boolean trigger = true;
        String name = "1";

        do {
            Book book = new Reader().choiceBook(books);
            if (!name.equals(book.getName())) {
                trigger = false;
            } else {
                name = book.getName();
            }
        } while (trigger);
    }

    @Test
    public void readBookExist() {
        new Reader().readBook(new Book("name", "author"));
    }

    @Test
    public void rateBookExist() {
        new Reader().rateBook(new Book("name", "author"));
    }

    @Test
    public void bookConstructorNameAuthor() {
        new Book("name", "author");
    }

    @Test
    public void bookConstructorFull() {
        new Book("name", "author", 10, 10);
    }

    @Test
    public void bookConstructorNotFull() {
        new Book("name", "author", 10);
    }

    @Test
    public void bookToString() {
        System.out.println(new Book("name", "author"));
    }

    @Test
    public void bookGetName() {
        new Book("name", "author").getName();
    }

    @Test
    public void bookGetAuthor() {
        new Book("name", "author").getAuthor();
    }

    @Test
    public void bookGetSerialNum() {
        new Book("name", "author").getSerialNum();
    }

    @Test
    public void bookGetPageCount() {
        new Book("name", "author").getPageCount();
    }


}
