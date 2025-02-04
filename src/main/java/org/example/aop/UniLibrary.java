package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("we take a book from UniLibrary " + book.getName());
    }

    public void returnBook() {
        System.out.println("we return a book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("we take magazine from UniLibrary");
    }
}
