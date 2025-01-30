package org.example.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello pet");
        pet.say();
    }
}
