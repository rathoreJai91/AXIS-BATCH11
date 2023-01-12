package BankSystem;

import java.util.Scanner;

public class Customer implements CustomerInterface {
    Scanner s = new Scanner(System.in);
    int customerId = 0;
    String customerName = "";
    String customerEmail = "";
    String customerPassword = "";
    long customerPhno = 0;
    long customerCardNo = 0;
    public Account account;

    @Override
    public void addCustomer() {
        
        System.out.print("Enter customer ID :");
        this.customerId = s.nextInt();
        System.out.print("Customer Name: ");
        this.customerName = s.next();
        System.out.print("Customer Email: ");
        this.customerEmail = s.next();
        System.out.print("Customer Password: ");
        this.customerPassword = s.next();
        System.out.print("Customer Phone number: ");
        this.customerPhno = s.nextLong();
        System.out.print("Customer Card Number: ");
        this.customerCardNo = s.nextLong();

        this.account = new Account().addAccount();
    }

    @Override
    public void deleteCustomer() {
        this.account.deleteAccount(this);
        System.out.println("Account Closed");
    }

    @Override
    public void editCustomer() {
        // TODO Auto-generated method stub
        
    }
    
}
