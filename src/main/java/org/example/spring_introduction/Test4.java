package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
            Dog myDog = (Dog) context.getBean("myPet", Dog.class);
            Dog yourDog = (Dog) context.getBean("myPet", Dog.class);
            System.out.println("Переменные ссылаются на один обьект" + (myDog == yourDog));

            System.out.println(myDog);
            System.out.println(yourDog);

            context.close();

    }
}
