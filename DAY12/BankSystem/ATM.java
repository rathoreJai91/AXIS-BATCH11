package BankSystem;

import java.util.Scanner;

public class ATM implements ATMInterface{
    Scanner s = new Scanner(System.in);
    @Override
    public Customer deposit(Customer customer) {
        System.out.print("Enter Amount want to deposit: ");
        float amount = s.nextFloat();
        customer.account.accBalance += amount;
        System.out.println(customer.account.accBalance);
        Transaction transaction = new Transaction();
        transaction.addTransaction("Deposit", amount, customer.account.accBalance);
        customer.account.transactions.add(transaction);
        return customer;
    }

    @Override
    public Customer withdraw(Customer customer) {
        System.out.print("Enter your card number : ");
        long cardNo = s.nextLong();
        System.out.print("Enter your pin :");
        String pin = s.next();
        if(cardNo==customer.customerCardNo && pin.equals(customer.customerPassword)){
            if(customer.account.accStatus.equals("Closed")){
                System.out.println("Collect your money :"+customer.account.accBalance);
                float amount = customer.account.accBalance;
                customer.account.accBalance=0;
                Transaction transaction = new Transaction();
                transaction.addTransaction("Closing Withdrawal", amount , customer.account.accBalance);
                customer.account.transactions.add(transaction);
            }else{
                System.out.print("Enter Amount want to Withdraw:");
                float amount = s.nextFloat();
                if(amount<customer.account.accBalance && (customer.account.accBalance-amount)>10000) {
                    System.out.println("Collect your money");
                    customer.account.accBalance -= amount;
                    System.out.println(customer.account.accBalance);
                    Transaction transaction = new Transaction();
                    transaction.addTransaction("Withdraw", amount, customer.account.accBalance);
                    customer.account.transactions.add(transaction);
                }else{
                    System.out.println("You don't have enough balance to withdraw.");
                }   
            }
        }else{
            System.out.println("Wrong Credentials");
        }
        return customer;
    }

    @Override
    public void checkBalance(Customer customer) {
        System.out.println("Your current balance : "+customer.account.accBalance);
        Transaction transaction = new Transaction();
        transaction.addTransaction("Check Balance", 0, customer.account.accBalance);
        customer.account.transactions.add(transaction);
    }
    
}
