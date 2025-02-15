package com.junit.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankingTransactionsTesting {

    //object
    BankingTransactions account = new BankingTransactions();

    //testing deposit method
    @Test
    void depositTesting() throws IllegalArgumentException{

        account.deposit(100);

        assertEquals(100, account.getBalance());

        account.deposit(120);

        assertEquals(220, account.getBalance());

    }


    //negative deposit testing with exception handelling
    @Test
    void depositTestingNegative() throws IllegalArgumentException{

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {account.deposit(-50.0);});

        assertEquals("Amount must be more then zero", e.getMessage());

    }

    //withdraw testing
    @Test
    void withdrawTesting() throws IllegalArgumentException{

        account.deposit(200);

        account.withdraw(120);

        assertEquals(80, account.getBalance());

        account.withdraw(80);
        assertEquals(0, account.getBalance());

    }

    //negative withdraw testing with exception handelling
    @Test
    void withdrawTestingNegative() throws IllegalArgumentException{

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {account.withdraw(50.0);});
        assertEquals("Insufficient Balance", e.getMessage());

    }

}
