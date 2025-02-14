package com.example.collections.listinterface.reverselist;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number until enter 0\n");
        int number;
        do{
            number= sc.nextInt();
            if(number!=0) {
                arrayList.add(number);
                linkedList.add(number);
            }
        }while (number!=0);
        System.out.println("Original ArrayList is: "+arrayList);
        System.out.println("Reversed ArrayList is: "+ReverseList.reverseUsingArrayList(arrayList));
        System.out.println("Original LinkedList is: "+linkedList);
        System.out.println("Reversed LinkedList is: "+ReverseList.reverseUsingLinkedList(linkedList));
    }
}
