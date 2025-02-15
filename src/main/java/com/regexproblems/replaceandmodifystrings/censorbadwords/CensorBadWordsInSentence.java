package com.regexproblems.replaceandmodifystrings.censorbadwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CensorBadWordsInSentence {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to replace all multiple space with single space: ");
            System.out.println("Press 0 to exit:");
            choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter your Text: ");
                String text=sc.nextLine();
                String [] splittedWords = text.split("\\s+");
                ArrayList<String> badWords = new ArrayList<>(Arrays.asList("damn","stupid","nonsense","wtf"));
                for (String words: splittedWords){
                    if(badWords.contains(words)){
                        text=text.replace(words,"****");
                    }
                }
                System.out.println(text);
            }else {
                System.out.println("exit!!");
                break;
            }
        }while(true);
    }
}

