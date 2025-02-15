package com.regexproblems.basicregexproblems.validatelicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
        public static void main(String[] args) {
            do{
                Scanner sc = new Scanner(System.in);
                int choice;
                System.out.println("Press 1 to validate a license plate number: ");
                choice=sc.nextInt();
                if (choice==1){
                    System.out.println("Enter your License Plate Number: ");
                    String username=sc.next();
                    String regex = "^[A-Z]{2}[0-9]{4}$";
                    Pattern pattern=Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(username);
                    if(matcher.matches()){
                        System.out.println("License Plate Number is Valid!");
                    }else{
                        System.out.println("Invalid  License Plate Number!");
                    }
                }else {
                    System.out.println("exit");
                    break;
                }
            }while(true);
        }
    }
