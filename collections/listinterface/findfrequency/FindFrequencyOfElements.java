package com.example.collections.listinterface.findfrequency;

import java.util.HashMap;
import java.util.List;

public class FindFrequencyOfElements {
    public static HashMap findFrequency(List<String> list){
        HashMap<String,Integer> hashMap = new HashMap<>();
       for(String element : list){
           if(hashMap.containsKey(element)){
               hashMap.put(element,hashMap.get(element)+1);
           }else{
               hashMap.put(element,1);
           }
       }
        return hashMap;
    }
}
