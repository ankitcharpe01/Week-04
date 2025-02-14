package com.example.collections.setinterface.settosortedlist;

import java.util.*;
public class ConvertSetToSortedList{
public static List<Integer> convertSetToSortedList(HashSet<Integer> inputSet) {
    List<Integer> inputList = new ArrayList<>(inputSet);
    bubbleSort(inputList);
    return inputList;
}
// Bubble Sort implementation
public static void bubbleSort(List<Integer> list) {
    int n = list.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (list.get(j) > list.get(j + 1)) {
                // Swap elements
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
    }
  }
}
