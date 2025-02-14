package com.exceptionhandling.exceptionpropagation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Amount: ");
            double amount = sc.nextDouble();
            System.out.println("Enter Rate: ");
            double rate = sc.nextDouble();
            System.out.println("Enter Years: ");
            int years = sc.nextInt();
        try {
            double calculatedInterest = ExceptionPropagation.calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest is: " + calculatedInterest);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
