package com.regexproblems.basicregexproblems.validateusername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to check validity of username: ");
            choice=sc.nextInt();
            if (choice==1){
                System.out.println("Enter your username: ");
                String username=sc.next();
                String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
                Pattern pattern=Pattern.compile(regex);
                Matcher matcher = pattern.matcher(username);
                if(matcher.matches()){
                    System.out.println("Username is Valid!");
                }else{
                    System.out.println("Invalid Username!");
                }
            }else {
                System.out.println("exit");
                break;
            }
        }while(true);
    }
}
