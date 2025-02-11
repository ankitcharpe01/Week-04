package com.example.generics.dynamiconlinemarketplace;

public class Book extends ProductCategory{
    public Book(String name, double priceRange) {
        super(name, priceRange,"Book");
    }

    @Override
    public void displayInfo() {
        System.out.println("Book name: "+getName()+"\nPrice range: "+getPriceRange());
        System.out.println();
    }
}
