package com.example.collections.setinterface.findsubsets;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1=new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Set-1 elements until entered 0 element:");
        do{
            int number = sc.nextInt();
            if(number!=0){
                hashSet1.add(number);
            }else{
                break;
            }
        }while(true);
        System.out.println("Enter Set-2 elements until entered 0 element:");
        do{
            int number = sc.nextInt();
            if(number!=0){
                hashSet2.add(number);
            }else{
                break;
            }
        }while(true);
        FIndSubsets.findingSubsets(hashSet1,hashSet2);
    }
}
