package com.example.collections.shoppingcartsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class ShoppingCart {
    private HashMap<String, Double> productPrices;
    private LinkedHashMap<String, Integer> cartItems;

    public ShoppingCart() {
        this.productPrices = new HashMap<>();
        this.cartItems = new LinkedHashMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cartItems.put(product, quantity);
        } else {
            System.out.println("Product not found.");
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            totalPrice += price * quantity;
        }
        return totalPrice;
    }

    public Map<String, Integer> getCartItems() {
        return new LinkedHashMap<>(cartItems);
    }

    public Map<String, Double> getSortedByPrice() {
        TreeMap<String, Double> sortedItems = new TreeMap<>((p1, p2) -> {
            double price1 = productPrices.get(p1);
            double price2 = productPrices.get(p2);
            return Double.compare(price1, price2);
        });
        for (String product : productPrices.keySet()) {
            sortedItems.put(product, productPrices.get(product));
        }
        return sortedItems;
    }
}
