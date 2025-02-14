package com.exceptionhandling.banktransactionsystem;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount)throws InsufficientBalanceException,IllegalArgumentException{
        if(amount<0)
            throw new IllegalArgumentException("Invalid amount!");
        if(amount>balance)
            throw new InsufficientBalanceException("Insufficient balance!");
        balance=balance-amount;
    }
}
