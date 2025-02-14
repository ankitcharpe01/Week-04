package com.example.collections.bankingsystem;

import java.util.*;

class BankingSystem {
    private HashMap<String, Double> customerAccounts;
    private Queue<WithdrawalRequest> withdrawalRequests;

    public BankingSystem() {
        this.customerAccounts = new HashMap<>();
        this.withdrawalRequests = new LinkedList<>();
    }

    public void addAccount(String accountNumber, double initialBalance) {
        customerAccounts.put(accountNumber, initialBalance);
    }

    public void deposit(String accountNumber, double amount) {
        if (customerAccounts.containsKey(accountNumber)) {
            double newBalance = customerAccounts.get(accountNumber) + amount;
            customerAccounts.put(accountNumber, newBalance);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (customerAccounts.containsKey(accountNumber) && customerAccounts.get(accountNumber) >= amount) {
            double newBalance = customerAccounts.get(accountNumber) - amount;
            customerAccounts.put(accountNumber, newBalance);
        }
    }

    public void addWithdrawalRequest(String accountNumber, double amount) {
        withdrawalRequests.add(new WithdrawalRequest(accountNumber, amount));
    }

    public void processWithdrawals() {
        while (!withdrawalRequests.isEmpty()) {
            WithdrawalRequest request = withdrawalRequests.poll();
            withdraw(request.getAccountNumber(), request.getAmount());
        }
    }

    public Map<String, Double> getSortedAccountsByBalance() {
        TreeMap<String, Double> sortedAccounts = new TreeMap<>((a1, a2) -> {
            double balance1 = customerAccounts.get(a1);
            double balance2 = customerAccounts.get(a2);
            return Double.compare(balance2, balance1);
        });
        sortedAccounts.putAll(customerAccounts);
        return sortedAccounts;
    }

    public double getBalance(String accountNumber) {
        return customerAccounts.getOrDefault(accountNumber, 0.0);
    }
}
