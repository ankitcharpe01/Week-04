package com.regexproblems.advanceproblems.validatesocialsecuritynumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to Validate a Social Security Number (SSN): ");
            choice=sc.nextInt();
            if (choice==1){
                System.out.println("Enter your Social Security Number (SSN): ");
                sc.nextLine();
                String text=sc.nextLine();
                String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
                Pattern pattern=Pattern.compile(regex);
                Matcher matcher = pattern.matcher(text);
                if(matcher.find()){
                    System.out.println("Your Social Security Number (SSN) is Valid!");
                }else{
                    System.out.println("Your Social Security Number (SSN) is Invalid!!");
                }
            }else {
                System.out.println("exit");
                break;
            }
        }while(true);
    }
}

