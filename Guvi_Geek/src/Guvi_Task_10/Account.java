package Guvi_Task_10;

import java.util.Scanner;

public class Account {
    // Data member
    private double balance;

    // Constructor with no arguments (default constructor)
    public Account() {
        this.balance = 0.0; // Initialize balance to zero
    }

    // Constructor with balance as argument
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Deposit amount must be positive.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance. Withdrawal amount exceeds current balance.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an Account object with default constructor
        Account account = new Account();
        System.out.println("Initial Balance: $" + account.balance);

        // Deposit funds
        System.out.println("Enter amount to deposit:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Current Balance after deposit: $" + account.balance);

        // Withdraw funds
        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Current Balance after withdrawal: $" + account.balance);

        // Close scanner
        scanner.close();
    }
}

