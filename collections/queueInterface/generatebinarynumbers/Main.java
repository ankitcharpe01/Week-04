package com.example.collections.queueInterface.generatebinarynumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("First " + number + " binary numbers: " + GenerateBinaryNumbers.generateBinaryNumbers(number));
    }
}
