package com.annotation.builtinannotation.suppressusage;
import java.util.ArrayList;

public class SuppressWarningsExample {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add("Sweta");
        System.out.println("The list is :" + arrayList);
    }
}

