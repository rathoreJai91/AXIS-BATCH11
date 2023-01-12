package BankSystem;

import java.util.Date;

public class Transaction implements TransactionInterface {

    int transactionId = 0;
    Date transactionDate;
    float transactionAmount;
    String transactionType;
    float currentBalance;

    @Override
    public void addTransaction(String tranType , float tranAmount , float currBalance) {
        this.transactionDate = new Date();
        this.transactionType = tranType;
        this.transactionAmount = tranAmount;
        this.currentBalance = currBalance;
    }
    
}
