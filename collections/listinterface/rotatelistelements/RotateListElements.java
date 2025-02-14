package com.example.collections.listinterface.rotatelistelements;

import java.util.List;

public class RotateListElements {
    public static List rotateListElements(List<Integer> list,int position){
        for (int i = 0; i < position; i++) {
            int temp = list.get(0);
            list.remove(0);
            list.add(temp);
        }
        return list;
    }
}
