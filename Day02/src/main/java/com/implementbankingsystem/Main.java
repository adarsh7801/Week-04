package com.implementbankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(new BankAccount("A101", "Alice", 5000));
        bank.addAccount(new BankAccount("A102", "Bob", 3000));
        bank.addAccount(new BankAccount("A103", "Charlie", 7000));

        // Display sorted accounts
        System.out.println("Sorted Accounts by Balance:");
        bank.displaySortedAccounts();

        // Deposit operation
        System.out.println("\nDepositing 2000 to Bob's account...");
        bank.deposit("A102", 2000);

        // Display updated sorted accounts
        System.out.println("\nUpdated Sorted Accounts:");
        bank.displaySortedAccounts();

        // Request & process withdrawals
        bank.requestWithdrawal("A101");
        bank.requestWithdrawal("A103");
        System.out.println("\nProcessing Withdrawals:");
        bank.processWithdrawals();
    }
}
