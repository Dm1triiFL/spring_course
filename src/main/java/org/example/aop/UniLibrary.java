package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("we take a book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("we return a book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("we take magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("we return a magazine to UniLibrary");
    }

    public void addBook() {
        System.out.println("we add a book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("we add a magazine to UniLibrary");
    }

}
