package com.reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class CalculatorReflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take inputs from user
        System.out.println("Enter first number:");
        int firstNum = sc.nextInt();

        System.out.println("Enter second number:");
        int secondNum = sc.nextInt();

        sc.close();
        try{
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            //get the class object
            Class<?> cls = calculator.getClass();

            //get the private method
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);

            //invoke the private method and get the result
            int result = (int)method.invoke(calculator,firstNum,secondNum);

            //display the result
            System.out.println("Multiplication is: "+result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
