package com.example.collections.listinterface.findnelementfromend;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> elements = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements until entered (exit):");
        do{
            String str= sc.next();
            if(!str.equalsIgnoreCase("exit")){
                elements.add(str);
            }else{
                break;
            }
        }while(true);

        System.out.println("Enter position from Last");
        int position = sc.nextInt();
        String nthElement = FindNthElementFromEnd.findNthFromLast(elements,position);
        System.out.println("Nth Element from the last is: "+nthElement);
    }
}

