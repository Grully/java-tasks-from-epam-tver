package com.epam.javaclasses;

import java.util.List;

public class BookImpl extends BookStaticMethods{
    public static void main(String[] args) {
        Book book1 = new Book(1, "For whom the bells tolls", "Hemingway", "AST", 1981, 200, 333.0, "Hard");
        Book book2 = new Book(2, "The old man and the sea", "Hemingway", "Litmir", 1982, 200, 250.0, "Hard");
        Book book3 = new Book(3, "Hobbit", "Tolkien", "AST", 1980, 200, 200.0, "Soft");
        Book book4 = new Book(4, "The Lord of the rings", "Tolkien", "Litmir", 1983, 300, 200.0, "Hard");
        Book book5 = new Book(5, "Hyperion", "Simmons", "AST", 1979, 200, 400.0, "Soft");

        Book[] bookArray = new Book[] {book1, book2, book3, book4, book5};
        List<Book> listOfPublishing = getListOfPublishing(bookArray, "AST");
        List<Book> listOfAuthor = getListOfAuthor(bookArray, "Tolkien");
        List<Book> listOfYear = getListAfterYear(bookArray, 1982);

        System.out.println(listOfPublishing);
        System.out.println(listOfAuthor);
        System.out.println(listOfYear);
    }
}
