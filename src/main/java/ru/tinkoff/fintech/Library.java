package ru.tinkoff.fintech;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Milk", "Cow");
        books[1] = new Book("Gav", "Dog", 3);
        books[2] = new Book("Myau", "Cat", 5, 360);
        books[3] = new Book("Muuu", "Cow", 4, 526);
        books[4] = new Book("Gav-gav-gav", "Dog", 12);

        Book selectedBook = new Reader().choiceBook(books);
        new Reader().readBook(selectedBook);
        new Reader().rateBook(selectedBook);
    }
}
