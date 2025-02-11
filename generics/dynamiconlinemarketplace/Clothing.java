package com.example.generics.dynamiconlinemarketplace;

public class Clothing extends ProductCategory{
    public Clothing(String name, double priceRange) {
        super(name, priceRange,"Clothing");
    }

    @Override
    public void displayInfo() {
        System.out.println("Cloth name: "+getName()+"\nPrice range: "+getPriceRange());
        System.out.println();
    }
}
