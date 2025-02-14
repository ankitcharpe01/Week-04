package com.example.collections.setinterface.settosortedlist;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Set elements until entered 0 element:");
        do{
            int number = sc.nextInt();
            if(number!=0){
                hashSet.add(number);
            }else{
                break;
            }
        }while(true);
        List<Integer> sortedList = ConvertSetToSortedList.convertSetToSortedList(hashSet);
        System.out.println("After Converted to Sorted List is: "+sortedList);
    }
}
