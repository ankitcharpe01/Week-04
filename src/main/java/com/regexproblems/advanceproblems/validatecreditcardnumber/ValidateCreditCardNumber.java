package com.regexproblems.advanceproblems.validatecreditcardnumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to Validate a Credit Card Number: ");
            choice=sc.nextInt();
            if (choice==1){
                System.out.println("Enter your  Validate a Credit Card Number: ");
                String username=sc.next();
                String regex = "4\\d{15}$ | ^5\\d{15}$";
                Pattern pattern=Pattern.compile(regex);
                Matcher matcher = pattern.matcher(username);
                if(matcher.matches()){
                    System.out.println("Your Credit Card Number is Valid!");
                }else{
                    System.out.println("Your Credit Card Number is Invalid!!");
                }
            }else {
                System.out.println("exit");
                break;
            }
        }while(true);
    }
}

