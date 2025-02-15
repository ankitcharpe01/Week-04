package com.regexproblems.extractionproblems.extractallemailaddressesfromtext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmail {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to extract all email addresses from a text>>: ");
            choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter your Text: ");
                String text=sc.nextLine();
                String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
                Pattern pattern=Pattern.compile(regex);
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
