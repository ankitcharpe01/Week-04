package com.example.collections.mapinterface.mapsmerging;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        String key;
        int value;
        String choice;
        System.out.println("Enter Map-1 Data:");
        do {
            // Take key input
            System.out.print("Enter a key (String): ");
            key = scanner.next();
            System.out.print("Enter a value (Integer): ");
            value = scanner.nextInt();
            map1.put(key, value);
            System.out.print("Do you want to add more key-value pairs? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));
        System.out.println("Enter Map-2 Data:");
        do {
            // Take key input
            System.out.print("Enter a key (String): ");
            key = scanner.next();
            System.out.print("Enter a value (Integer): ");
            value = scanner.nextInt();
            map2.put(key, value);
            System.out.print("Do you want to add more key-value pairs? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));
        Map<String, Integer> result = MergeMaps.mergeMaps(map1, map2);
        System.out.println("Merged Map: " + result);
    }
}
