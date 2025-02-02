package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("we take a book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("we return a book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("we take magazine from UniLibrary");
    }
}
