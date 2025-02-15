package com.regexproblems.replaceandmodifystrings.spacereplacing;

import java.util.Scanner;

public class SpacesReplacing {
        public static void main(String[] args) {
            do{
                Scanner sc = new Scanner(System.in);
                int choice;
                System.out.println("Press 1 to replace all multiple space with single space: ");
                System.out.println("Press 0 to exit:");
                choice=sc.nextInt();
                sc.nextLine();
                if (choice==1){
                    System.out.println("Enter your Text: ");
                    String text=sc.nextLine();
                    String replace = text.replaceAll("\\s+"," ");
                    System.out.println(replace);
                }else {
                    System.out.println("exit!!");
                    break;
                }
            }while(true);
        }
    }

