package com.example.collections.listinterface.removeduplicates;

import com.example.collections.listinterface.rotatelistelements.RotateListElements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements until entered 0 element:");
        do{
            int number = sc.nextInt();
            if(number!=0){
                elements.add(number);
            }else{
                break;
            }
        }while(true);
        System.out.println("Original List is: "+elements);
        HashSet duplicateRemoved = RemoveDuplicates.removeDuplicates(elements);
        System.out.println("After Removing Duplicates Elements: "+duplicateRemoved);
    }
}
