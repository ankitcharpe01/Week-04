package com.example.collections.listinterface.rotatelistelements;

import java.util.ArrayList;
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

        System.out.println("Enter position to Rotate the list");
        int position = sc.nextInt();
        System.out.println("Original List is: "+elements);
        List rotatedList = RotateListElements.rotateListElements(elements,position);
        System.out.println("Rotated List is: "+rotatedList);
    }
}
