package com.exceptionhandling.banktransactionsystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter initial balance : ");
        double balance=sc.nextDouble();
        BankAccount account=new BankAccount(balance);
        System.out.print("Enter amount to withdraw : ");
        double amount= sc.nextDouble();
        try{
            account.withdraw(amount);
            System.out.println("Withdrawal successful, new balance: "+account.getBalance());
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }
        catch (InsufficientBalanceException ex){
            System.err.println("InsufficientBalanceException::"+ex.getMessage());
        }
    }
}
