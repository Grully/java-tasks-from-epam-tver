package com.epam.javaclasses;

import java.util.ArrayList;
import java.util.List;

public class BookStaticMethods {

   static List<Book> getListOfAuthor(Book[] arrayOfBooks, String author){
        List<Book> listOfAuthors = new ArrayList<>();
        for(Book book: arrayOfBooks){
            if(book.getAuthor() == author){
                listOfAuthors.add(book);
            }
        }
        return  listOfAuthors;
    }

    static List<Book> getListOfPublishing(Book[] arrayOfBooks, String publisher){
        List<Book> listOfPublishing = new ArrayList<>();
        for(Book book: arrayOfBooks){
            if(book.getPublisher() == publisher){
                listOfPublishing.add(book);
            }
        }
        return  listOfPublishing;
    }
    static List<Book> getListAfterYear(Book[] arrayOfBooks, int year){
        List<Book> listOfYear = new ArrayList<>();
        for(Book book: arrayOfBooks){
            if(book.getYear() > year){
                listOfYear.add(book);
            }
        }
        return  listOfYear;
    }
}
