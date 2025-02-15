package com.regexproblems.basicregexproblems.validatehexcolorcode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to Validate a Hex Color Code: ");
            choice=sc.nextInt();
            if (choice==1){
                System.out.println("Enter your License Plate Number: ");
                String username=sc.next();
                String regex = "^#[A-Fa-f0-9]{6}$";
                Pattern pattern=Pattern.compile(regex);
                Matcher matcher = pattern.matcher(username);
                if(matcher.matches()){
                    System.out.println("Hex Color Code is Valid!");
                }else{
                    System.out.println("Hex Color Code is Invalid!!");
                }
            }else {
                System.out.println("exit");
                break;
            }
        }while(true);
    }
}
