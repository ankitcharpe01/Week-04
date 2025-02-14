package com.example.collections.listinterface.findfrequency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String>elements = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements unit entered exit!: ");
        do{
            String str = sc.next();
            if(!str.equalsIgnoreCase("exit")){
                elements.add(str);
            }else{
                break;
            }
        }while (true);
        System.out.println("List is: "+elements);
        System.out.println("Frequency of Elements: "+FindFrequencyOfElements.findFrequency(elements));
    }
}
