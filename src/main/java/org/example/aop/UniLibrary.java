package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("we take a book from UniLibrary");
        System.out.println("-------------------------------");
    }

    public String returnBook() {
        System.out.println("we return a book to UniLibrary");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("we take magazine from UniLibrary");
        System.out.println("-------------------------------");
    }

    public void returnMagazine() {
        System.out.println("we return a magazine to UniLibrary");
        System.out.println("-------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("we add a book to UniLibrary");
        System.out.println("-------------------------------");
    }

    public void addMagazine() {
        System.out.println("we add a magazine to UniLibrary");
        System.out.println("-------------------------------");
    }

}
