package com.regexproblems.advanceproblems.extractprogrammingnames;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNames {
        public static void main(String[] args) {
            do{
                Scanner sc = new Scanner(System.in);
                int choice;
                System.out.println("Press 1 to extract all programming language names from a text: ");
                choice=sc.nextInt();
                sc.nextLine();
                if (choice==1){
                    System.out.println("Enter your Text: ");
                    String text=sc.nextLine();
                    String regex = "Java|JavaScript|Python|C++|C|Ruby|C#|.net|CSS|React|NodeJs";
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

