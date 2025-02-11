package com.example.generics.smartwarehousesystem;

public class Main {
    public static void main(String[] args) {
        Electronics e1=new Electronics("Asus laptop",55000,2);
        Electronics e2=new Electronics("DELL laptop",70999,4);
        Furniture f1=new Furniture("Table",2099,3);
        Furniture f2=new Furniture("Chair",1599,5);
        Groceries g1=new Groceries("FaceWash",700,10);
        Groceries g2=new Groceries("Chocolate",550,8);
        Storage<Electronics> electronics=new Storage<>();
        electronics.add(e1);
        electronics.add(e2);
        Storage<Furniture> furniture=new Storage<>();
        furniture.add(f1);
        furniture.add(f2);
        Storage<Groceries> groceries=new Storage<>();
        groceries.add(g1);
        groceries.add(g2);
        electronics.displayAllItems(electronics.getList());
        System.out.println("---------------------------");
        furniture.displayAllItems(furniture.getList());
        System.out.println("---------------------------");
        groceries.displayAllItems(groceries.getList());
    }
}

