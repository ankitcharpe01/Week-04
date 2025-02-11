package com.example.generics.dynamiconlinemarketplace;

public abstract class ProductCategory{
    private String name;
    private double priceRange;
    private String category;

    public ProductCategory(String name, double priceRange, String category) {
        this.name = name;
        this.priceRange = priceRange;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(double priceRange) {
        this.priceRange = priceRange;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public abstract void displayInfo();
}
