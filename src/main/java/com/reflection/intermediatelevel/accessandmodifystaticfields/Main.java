package com.reflection.intermediatelevel.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the Class object for Configuration
            Class<?> configClass = Configuration.class;

            //Access the private static field API_KEY
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            //Override access restrictions
            apiKeyField.setAccessible(true);

            //Print the original value of API_KEY
            String originalValue = (String) apiKeyField.get(null); // null for static fields
            System.out.println("Original API_KEY: " + originalValue);

            // Modify the value of API_KEY
            apiKeyField.set(null, "new-key");

            String updatedValue = (String) apiKeyField.get(null);
            System.out.println("Updated API_KEY: " + updatedValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

