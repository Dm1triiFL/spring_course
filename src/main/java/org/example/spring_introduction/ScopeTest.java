package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = (Dog) context.getBean("dog", Dog.class);
        Dog yourDog = (Dog) context.getBean("dog", Dog.class);
        context.close();
    }
}
