package com.reflection.basiclevel.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionInformation {
    public static void reflectionInfo(String className)
    {
        try {
            Class<?> cls = Class.forName(className);//Load class dynamically
            System.out.println("\nClass Name is: " + cls.getName());

            //Print Fields
            System.out.println("\nFields: ");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(" " + field);
            }

            //Print Methods
            System.out.println("\nMethods: ");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(" " + method);
            }

            //Print Constructors
            System.out.println("\nConstructors: ");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(" " + constructor);
            }
        }catch (ClassNotFoundException e){
            System.out.println("Class Not found! Please enter valid class name...");
        }
    }
}
