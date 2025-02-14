package com.example.collections.mapinterface.highestvalue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String key;
        int value;
        String choice;

        do {
            // Take key input
            System.out.print("Enter a key (String): ");
            key = scanner.next();
            System.out.print("Enter a value (Integer): ");
            value = scanner.nextInt();
            map.put(key, value);
            System.out.print("Do you want to add more key-value pairs? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));
        String result = HighestValue.findKeyWithMaximumValue(map);
        System.out.println("Key with the maximum value: " + result);

        scanner.close();
    }

}
