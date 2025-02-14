package com.example.collections.setinterface.unionIntersection;

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

        System.out.println("Set1 : "+set1);
        System.out.println("Set2 : "+set2);
        Set union= ComputeUnionIntersection.computeUnion(set1,set2);
        Set intersection= ComputeUnionIntersection.computeIntersection(set1,set2);
        System.out.println("Union is: "+union);
        System.out.println("Intersection is: "+intersection);
    }
}

