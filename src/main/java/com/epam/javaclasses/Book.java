package com.epam.javaclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
        private int id;
        private String name;
        private String author;
        private String publisher;
        private int year;
        private int pageCounter;
        private double price;
        private String bindingType;

    public Book(int id) {
        this.id = id;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(int id, String name, String author, String publisher, int year, int pageCounter, double price, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCounter = pageCounter;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCounter() {
        return pageCounter;
    }

    public void setPageCounter(int pageCounter) {
        this.pageCounter = pageCounter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageCounter=" + pageCounter +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
