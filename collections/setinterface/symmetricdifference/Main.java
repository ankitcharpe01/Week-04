package com.example.collections.setinterface.symmetricdifference;
import com.example.collections.setinterface.checkequals.CheckSetEquals;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Set-1 elements until entered 0 element:");
        do{
            int number = sc.nextInt();
            if(number!=0){
                set1.add(number);
            }else{
                break;
            }
        }while(true);
        System.out.println("Enter Set-2 elements until entered 0 element:");
        do{
            int number = sc.nextInt();
            if(number!=0){
                set2.add(number);
            }else{
                break;
            }
        }while(true);
        Set difference=SymmetricDifference.symmetricDifference(set1,set2);
        System.out.println("Symmetric Difference of sets is: "+difference);
    }
}

