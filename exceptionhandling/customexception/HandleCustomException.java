package com.exceptionhandling.customexception;

public class HandleCustomException {
    public static void validateAge(int age)throws InvalidAgeException{
               if(age>=18){
                   System.out.println("Access granted!");
               }else {
                   InvalidAgeException object = new InvalidAgeException("Age must be 18 or above");
                   throw object;
               }
    }
}
