package com.regexproblems.advanceproblems.extractcurrencyvalues;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to extract all Currency Values from a text: ");
            choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter your Text: ");
                String text=sc.nextLine();
                String regex = "\\$\\d+(\\.\\d{2})?|\\d+.\\d{2}";
                Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {
                    System.out.println("Matched: " + matcher.group());
                }
            }else {
                System.out.println("exit");
                break;
            }
        }while(true);
    }
}

