package com.regexproblems.advanceproblems.findrepeatingwords;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatingWords {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("\nPress 1 to extract all programming language names from a text: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Enter your Text: ");
                String text = sc.nextLine();
                findRepeatingWords(text);
            } else {
                System.out.println("exit");
                break;
            }
        } while (true);


    }

    public static void findRepeatingWords(String sentence) {
        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.print("Repeating words: ");
        boolean first = true;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(entry.getKey());
                first = false;
            }
        }
    }
}

