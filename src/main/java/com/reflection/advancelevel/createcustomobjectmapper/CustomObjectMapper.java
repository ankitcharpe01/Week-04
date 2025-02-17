package com.reflection.advancelevel.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    // Method to map values from a Map to an object using reflection
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws IllegalAccessException, InstantiationException {
        // Create a new instance of the class
        T instance = clazz.newInstance();

        // Iterate over each entry in the map
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);

                // Set the field value from the map
                field.set(instance, fieldValue);
            } catch (NoSuchFieldException e) {
                System.out.println("Field " + fieldName + " not found in class " + clazz.getSimpleName());
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        try {
            // Create a sample map
            Map<String, Object> properties = Map.of(
                    "name", "Alice",
                    "age", 30
            );

            // Create an object of Person using the map values
            Person person = CustomObjectMapper.toObject(Person.class, properties);
            System.out.println("Person name: " + person.getName());
            System.out.println("Person age: " + person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}