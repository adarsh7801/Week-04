package com.implementbankingsystem;

import java.util.*;

public class BankingSystem {
    private Map<String, BankAccount> accounts = new HashMap<>();
    private TreeMap<Double, List<BankAccount>> sortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
        sortedAccounts.computeIfAbsent(account.getBalance(), k -> new ArrayList<>()).add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            sortedAccounts.get(account.getBalance()).remove(account);
            account.deposit(amount);
            sortedAccounts.computeIfAbsent(account.getBalance(), k -> new ArrayList<>()).add(account);
        }
    }

    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accNum = withdrawalQueue.poll();
            BankAccount account = accounts.get(accNum);
            if (account != null) {
                System.out.println("Processing withdrawal for: " + account.getCustomerName());
            }
        }
    }

    public void displaySortedAccounts() {
        for (Map.Entry<Double, List<BankAccount>> entry : sortedAccounts.entrySet()) {
            for (BankAccount acc : entry.getValue()) {
                System.out.println(acc);
            }
        }
    }
}
