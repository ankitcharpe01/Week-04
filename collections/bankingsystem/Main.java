package com.example.collections.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        bankingSystem.addAccount("12345", 1000.00);
        bankingSystem.addAccount("67890", 5000.00);
        bankingSystem.addAccount("11223", 1500.00);

        bankingSystem.deposit("12345", 500.00);
        bankingSystem.withdraw("67890", 1000.00);
        bankingSystem.addWithdrawalRequest("11223", 200.00);
        bankingSystem.addWithdrawalRequest("12345", 300.00);

        bankingSystem.processWithdrawals();

        System.out.println("Account Balances: " + bankingSystem.getSortedAccountsByBalance());
    }
}