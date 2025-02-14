package com.exceptionhandling.finallyblock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b = sc.nextInt();

            int ans = PerformDivision.division(a, b);
            System.out.println("Division: " + ans);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception occurred "+e.getMessage());
        } finally {
            System.out.println("finally! Operation Completed");
        }
    }
}
