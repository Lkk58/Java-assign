/*
bank account program
Author:Lenah
Reg no:CT101/G/20075/23
Date:15-march-2025
assignment 
*/
public class BankAccount {
    private double balance; // Private balance variable

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Ensure balance is never negative initially
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (ensuring sufficient balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Getter method to check balance (but not modify it)
    public double getBalance() {
        return balance;
    }
}
