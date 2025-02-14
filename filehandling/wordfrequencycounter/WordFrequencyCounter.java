package com.example.filehandling.wordfrequencycounter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void wordFrequencyCounter(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.toLowerCase(); // Convert to lowercase to make it case-insensitive
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Display the top 5 most frequent words
        System.out.println("Top 5 most frequent words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (count >= 5) break;
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
        }
    }
}