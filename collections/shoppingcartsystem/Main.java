package com.example.collections.shoppingcartsystem;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct("Laptop", 1200.00);
        shoppingCart.addProduct("Smartphone", 800.00);
        shoppingCart.addProduct("Headphones", 150.00);

        shoppingCart.addToCart("Laptop", 1);
        shoppingCart.addToCart("Smartphone", 2);
        shoppingCart.addToCart("Headphones", 1);

        System.out.println("Cart Items in order of addition: " + shoppingCart.getCartItems());
        System.out.println("Total Price: $" + shoppingCart.calculateTotalPrice());
        System.out.println("Sorted by Price: " + shoppingCart.getSortedByPrice());
    }
}
