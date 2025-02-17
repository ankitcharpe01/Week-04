package com.reflection.intermediatelevel.retrieveannotationsatruntime;

public class AnnotationRetrieval {
    public static void main(String[] args) {
        try {
            // Get the Class object for Book
            Class<?> bookClass = Book.class;

            // Check if @Author annotation is present
            if (bookClass.isAnnotationPresent(Author.class)) {
                Author author = bookClass.getAnnotation(Author.class);
                // Display the annotation value
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("@Author annotation not found!!");
            }

            //invoke the display method through Book class instance
            Book book = new Book();
            book.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
