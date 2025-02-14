package com.exceptionhandling.exceptionpropagation;

public class ExceptionPropagation {
    public static double calculateInterest(double amount ,double rate ,int years)throws IllegalArgumentException{
        if(amount<0 || rate<0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }else{
            double interest = (amount*rate*years)/100;
            return interest;
        }
    }
}
