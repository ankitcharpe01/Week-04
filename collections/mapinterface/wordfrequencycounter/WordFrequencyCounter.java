package com.example.collections.mapinterface.wordfrequencycounter;

import java.util.HashMap;

public class WordFrequencyCounter {
    public HashMap<String , Integer> findFrequency(String text){
        HashMap<String , Integer> wordFrequency=new HashMap<>();
        text=text.toLowerCase().replaceAll("[^a-zA-Z0\\s]" , "");
        String textString[]=text.split(" ");
        for (int i = 0; i <textString.length ; i++) {
            wordFrequency.put(textString[i].toLowerCase() , wordFrequency.getOrDefault(textString[i].toLowerCase(),0)+1);
        }
        return wordFrequency;
    }

}
