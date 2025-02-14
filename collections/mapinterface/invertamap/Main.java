package com.example.collections.mapinterface.invertamap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter exit for done inputting");
            System.out.println("Enter Character:");
           String str = sc.next();
            if(str.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println("Enter value: ");
          int value = sc.nextInt();;

            inputMap.put(str,value);

        }while(true);
        Map<Integer, List<String>> invertedMap = InvertAMap.invertMap(inputMap);
        System.out.println(invertedMap);
    }
}
