package com.reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Field;
import java.util.Scanner;

public class PersonReflection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        Person person = new Person(age);
        System.out.println("Before modification person's Age: ");
        person.displayAge();
        System.out.println("Set Age to:");
        int newAge = sc.nextInt();
        try {
            Class<?> cls = person.getClass();
            Field ageField = cls.getDeclaredField("age");
            //Get the private field Age
            ageField.setAccessible(true);

            //Modify the private fields value
            ageField.set(person,newAge);
            System.out.println("\nAfter modification:");
            person.displayAge();

            int modifiedAge =(int)ageField.get(person);
            System.out.println("Retrieved Age using Reflection: " + modifiedAge);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
