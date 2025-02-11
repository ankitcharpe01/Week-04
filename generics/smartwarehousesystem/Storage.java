package com.example.generics.smartwarehousesystem;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem>{
    List<T> list;
    public Storage(){
        list=new ArrayList<>();
    }
    public void add(T item){
        list.add(item);
    }
    public List<T> getList(){
        return list;
    }
    public void displayAllItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item:items){
            item.display();
        }
    }

}
