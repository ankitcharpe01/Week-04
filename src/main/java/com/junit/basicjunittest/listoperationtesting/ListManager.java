package com.junit.basicjunittest.listoperationtesting;

import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
            System.out.println("Element added successfully!");
        }
    }
    public boolean removeElement(List<Integer> list, int element) {
        if (list != null) {
            return list.remove(Integer.valueOf(element));
        }
        return false;
    }
    public int getSize(List<Integer> list) {
        if (list != null) {
            return list.size();
        }
        return -1;
    }
}
