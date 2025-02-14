package com.exceptionhandling.uncheckedexception;

public class HandleUncheckedException {
    public static void handleCheckedException(int number1 ,int number2){
        try {
            int data = number1/number2;
            System.out.println("Division is: "+data);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
