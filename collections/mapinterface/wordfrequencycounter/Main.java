package com.example.collections.mapinterface.wordfrequencycounter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a text");
        String text=sc.nextLine();
        WordFrequencyCounter wordFrequencyCounter=new WordFrequencyCounter();
        System.out.println("The frequency count of each word in the text :");
        System.out.println(wordFrequencyCounter.findFrequency(text));
    }
}
