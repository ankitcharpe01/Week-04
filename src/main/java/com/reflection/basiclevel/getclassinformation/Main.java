package com.reflection.basiclevel.getclassinformation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fully qualified class name (e.g. java.util.ArrayList): ");
        String className = scanner.nextLine();
        ReflectionInformation.reflectionInfo(className);
        scanner.close();
    }
}
