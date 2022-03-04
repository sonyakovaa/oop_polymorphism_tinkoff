package ru.tinkoff.fintech;

import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] books) {
        Random rnd = new Random();
        return books[rnd.nextInt(books.length)];
    }

    public void readBook(Book book) {
        System.out.println(book);
    }

    public void rateBook(Book book) {
        int bookEvaluation = book.getName().length() + book.getAuthor().length(); // 11 + 3 = 14
        Random rnd = new Random();

        if (book.getSerialNum() == 0) {
            bookEvaluation -= rnd.nextInt(bookEvaluation);
        }
        else {
            bookEvaluation -= book.getSerialNum();
        }

        if (book.getPageCount()== 0) {
            bookEvaluation -= rnd.nextInt(bookEvaluation);
        } else {
            bookEvaluation += book.getPageCount();
        }

        System.out.println("Title of the book - " + book.getName() + ", reader's evaluation of the book - " + bookEvaluation);
    }
}
