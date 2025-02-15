package com.regexproblems.extractionproblems.extractallcapitalizedwords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to extract all capitalized words from a sentence: ");
            choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter your Text: ");
                String text=sc.nextLine();
                String regex = "[A-Z][a-z]+";
                Pattern pattern=Pattern.compile(regex);
                Matcher matcher = pattern.matcher(text);

                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }else {
                System.out.println("exit");
                break;
            }
        }while(true);
    }
}