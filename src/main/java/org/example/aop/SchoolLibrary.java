package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("we take a book from SchoolLibrary");
    }

}
