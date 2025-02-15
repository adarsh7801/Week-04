
package com.junit.advanced;

public class BankingTransactions {

    double balance=0;


    //constructor
    public void balance(){
        this.balance = balance;
    }

    //deposit method
    public void deposit(double amount) throws IllegalArgumentException {

        if (amount<0){
            throw new IllegalArgumentException("Amount must be more then zero");
        }

        balance = balance+amount;

    }

    //withdraw method
    public void withdraw(double amount) throws IllegalArgumentException {

        if ((balance - amount)<0){
            throw new IllegalArgumentException("Insufficient Balance");
        }

        balance = balance-amount;

    }

    //get balance method
    public double getBalance(){

        return balance;
    }

}
