package com.reflection.basiclevel.accessprivatefield;

public class Person {
    //private field
    private int age;

    //initialization
    public Person(int age) {
        this.age = age;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayAge(){
        System.out.println("Age: "+age);
    }
}
