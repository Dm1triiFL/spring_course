package org.example.aop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Преступление и наказание")
    private String book;

    @Value("Ф М Достоевский")
    private String author;

    public String getBook() {
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("1866")
    private int yearOfPublication;

    public String getName() {
        return book;
    }
}
