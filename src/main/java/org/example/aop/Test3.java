package org.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("main start");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library= context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("вернули книгу в библиотеку: " + bookName);


        context.close();
        System.out.println("main ends");

    }
}
