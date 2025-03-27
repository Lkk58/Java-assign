/*
bank account inheritance program
Author:Lenah
Reg no:CT101/G/20075/23
Date:15-march-2025
assignment 
*/
// Base class BankAccount (Abstract)
abstract class BankAccount {
    protected double balance; // Protected field for balance

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
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

    // Abstract withdraw method to be implemented by subclasses
    public abstract void withdraw(double amount);

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    // Constructor to initialize balance
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method with minimum balance condition
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from SavingsAccount.");
        } else {
            System.out.println("Withdrawal failed. Minimum balance of $100 required.");
        }
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0; // $1 transaction fee

    // Constructor to initialize balance
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method with transaction fee deduction
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount - TRANSACTION_FEE) >= 0) {
            balance -= (amount + TRANSACTION_FEE);
            System.out.println("Withdrawn: $" + amount + " from CheckingAccount (Fee: $1 applied).");
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }
}
