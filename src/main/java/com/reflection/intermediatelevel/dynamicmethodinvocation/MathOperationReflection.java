package com.reflection.intermediatelevel.dynamicmethodinvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperationReflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an instance of Calculator
        MathOperations mathOperations = new MathOperations();

        while (true) {
            System.out.println("Enter Method name which you want to invoke:");
            System.out.println("1.Perform Addition: method name-add");
            System.out.println("2.Perform Subtraction: method name-subtract");
            System.out.println("3.Perform multiplication: method name-multiply");
            System.out.println("Press 0 for stop doing operations");
            String methodName = sc.next();

            if (methodName.equals("0")) {
                System.out.println("exit!");
                break;
            }

            //Take inputs from user
            System.out.println("Enter first number:");
            int firstNum = sc.nextInt();

            System.out.println("Enter second number:");
            int secondNum = sc.nextInt();

            try {
                //get the class object
                Class<?> cls = mathOperations.getClass();

                //get the private method
                Method method = cls.getDeclaredMethod(methodName, int.class, int.class);
                method.setAccessible(true);

                //invoke the private method and get the result
                int result = (int) method.invoke(mathOperations, firstNum, secondNum);

                //display the result
                System.out.println("Result of method " + methodName + " is: " + result);
            } catch (NoSuchMethodException e) {
                System.out.println("Method not found: " + methodName + " " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error in invoking the method: " + e.getMessage());
            }
        }
        sc.close();
    }
}