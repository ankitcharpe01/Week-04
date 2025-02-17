package com.annotation.builtinannotation.overrideusage;
public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Hey, I am a dog");
    }
}