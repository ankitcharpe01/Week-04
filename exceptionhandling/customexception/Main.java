package com.exceptionhandling.customexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            HandleCustomException.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age exception caught: "+e.getMessage());
        }finally {
            sc.close();
        }
    }
}
