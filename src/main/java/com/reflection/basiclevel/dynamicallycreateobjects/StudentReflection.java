package com.reflection.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class StudentReflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take inputs from user
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        sc.close();

        try{
            //create instance of student class
            Student student = new Student(name,age);
            Class<?>cls = student.getClass();

            Constructor<?> constructor = cls.getConstructor(String.class,int.class);
            // Create a new instance dynamically using Reflection
            Object obj=constructor.newInstance(name,age);
            Student studentObj =(Student)obj;

            //Retrieve the method
            Method methodDisplay =cls.getMethod("displayStudent");
            // Invoke displayStudent()
            methodDisplay.invoke(studentObj);

        } catch (Exception e) {
           e.printStackTrace();
        }
    }

}
