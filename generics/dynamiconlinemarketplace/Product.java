package com.example.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Product <T extends ProductCategory>{
    List<ProductCategory> products;

    public Product() {
        this.products = new ArrayList<>();
    }

    public void addProduct(T category){
        products.add(category);
    }
    public List<ProductCategory> getProducts() {
        return products;
    }

    public <T extends ProductCategory> void applyDiscount(T product,double percentage){
        double originalPrice =product.getPriceRange();
        double discountedPrice = product.getPriceRange()-product.getPriceRange()*percentage/100;
        product.setPriceRange(discountedPrice);
        System.out.println(product.getName()+" After "+percentage+"% Discount, Price Updated from "+originalPrice+" to "+discountedPrice);
    }

    public void displayAllItems(){
        for (ProductCategory product:products){
            product.displayInfo();
        }
    }
}
