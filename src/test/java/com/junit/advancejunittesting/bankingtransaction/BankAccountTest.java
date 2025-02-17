package com.junit.advancejunittesting.bankingtransaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount=new BankAccount();
    @Test
    void testDeposit() {
        bankAccount.deposit(200.0);
        assertEquals(200.0, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(500.0);
        bankAccount.withdraw(100.0);
        assertEquals(400.0, bankAccount.getBalance());
    }

    @Test
    void testMultipleTransactions() {
        bankAccount.deposit(1000.0);
        bankAccount.withdraw(300.0);
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        assertEquals(1000.0, bankAccount.getBalance());
    }
}