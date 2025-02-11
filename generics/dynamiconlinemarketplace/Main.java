package com.example.generics.dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Data Structures",2050.0);
        Book book2 = new Book("Java",1550.0);
        Clothing cloth1 = new Clothing("Shirt",1800.0);
        Clothing cloth2 = new Clothing("Jeans",1900);
        Gadgets gadget1 = new Gadgets("Drone",80000.0);
        Gadgets gadget2 = new Gadgets("Camera",300000);

        Product<Book> books = new Product<>();
        books.addProduct(book1);
        books.addProduct(book2);

        Product<Clothing>cloths = new Product<>();
        cloths.addProduct(cloth1);
        cloths.addProduct(cloth2);

        Product<Gadgets> gadgets = new Product<>();
        gadgets.addProduct(gadget1);
        gadgets.addProduct(gadget2);

        System.out.println("---BOOKS---\n");
        books.applyDiscount(book1,20);
        books.applyDiscount(book2,17);
        System.out.println();
        books.displayAllItems();

        System.out.println("---CLOTHS---\n");
        cloths.applyDiscount(cloth1,33);
        cloths.applyDiscount(cloth2,18);
        System.out.println();
        cloths.displayAllItems();

        System.out.println("---GADGETS---\n");
        gadgets.applyDiscount(gadget1,12);
        gadgets.applyDiscount(gadget2,21);
        System.out.println();
        gadgets.displayAllItems();

    }
}
