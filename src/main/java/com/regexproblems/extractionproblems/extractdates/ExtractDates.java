package com.regexproblems.extractionproblems.extractdates;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to extract all Dates from a sentences: ");
            choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter your Text: ");
                String text=sc.nextLine();
                String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
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

