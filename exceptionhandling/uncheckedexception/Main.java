package com.exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Two Numbers...");
            System.out.println("Enter First Number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter Second Number: ");
            int secondNumber = scanner.nextInt();
            HandleUncheckedException.handleCheckedException(firstNumber,secondNumber);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught!");
        }
    }
}
