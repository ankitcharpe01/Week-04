package com.example.generics.smartwarehousesystem;

public class Furniture extends WarehouseItem{
    public Furniture(String name, double price,int quantity) {
        super(name, price,quantity);
    }

    @Override
    public void display() {
        System.out.println("Furniture Items:");
        System.out.println("Item name  : "+getName());
        System.out.println("Quantity : "+getQuantity());
        System.out.println("Price : "+getPrice());

    }
}
