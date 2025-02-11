package com.example.generics.smartwarehousesystem;

public class Groceries extends WarehouseItem{

    public Groceries(String name, double price,int quantity) {
        super(name, price,quantity);
    }

    @Override
    public void display() {
        System.out.println("Grocery Items:");
        System.out.println("Item name  : "+getName());
        System.out.println("Quantity : "+getQuantity());
        System.out.println("Price : "+getPrice());
    }
}
