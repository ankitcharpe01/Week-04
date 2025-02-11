package com.example.generics.dynamiconlinemarketplace;

public class Gadgets extends ProductCategory{
    public Gadgets(String name, double priceRange) {
        super(name, priceRange,"Gadget");
    }

    @Override
    public void displayInfo() {
        System.out.println("Gadget name: "+getName()+"\nPrice range: "+getPriceRange());
        System.out.println();
    }
}
