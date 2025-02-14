package com.exceptionhandling.exceptionpropagationinmethod;

import java.util.Scanner;

public class ExceptionPropagation {
    // method 1
    static int method1(int a, int b) {
        return a / b;
    }

    // calling method 1 in method 2
    static int method2(int a, int b) {
        return method1(a, b);
    }

    // method calling
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = method2(a, b);
            System.out.println("Division: " + ans);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception occurred.");
        }
    }
}
