package org.example.spring_introduction;

public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
