package BankSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Account extends Bank implements  AccountInterface{
    ArrayList<Transaction> transactions = new ArrayList<>(); 
    Scanner s =new Scanner(System.in);
    long accNumber = 0;
    float accBalance = 0;
    String accType = "";
    String accStatus = "";

    @Override
    public Account addAccount() {
        System.out.print("Enter Account Number :");
        this.accNumber = s.nextLong();
        System.out.print("Enter Account Balance :");
        this.accBalance = s.nextFloat();
        System.out.print("Enter Account type :");
        this.accType = s.next();
        System.out.print("Enter Account Status :");
        this.accStatus = s.next();
        return this;
    }

    @Override
    public void deleteAccount(Customer customer) {
        this.accStatus = "Closed";
        ATM atmobj = new ATM();
        atmobj.withdraw(customer);
        System.out.println("Account Number :" + this.accNumber);
        System.out.println("Account Status :" + this.accStatus);  
    }

    @Override
    public void editAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void searchAccount() {
        System.out.println("Account Number :"+this.accNumber);
        System.out.println("Account Type :"+this.accType);
        System.out.println("Account Balance :"+this.accBalance);
        System.out.println("Account Status :"+this.accStatus);
        
    }
    public void transactionHistory(){
        for(Transaction obj : transactions){
            System.out.print(obj.transactionDate+" ");
            System.out.print(obj.transactionAmount+" ");
            System.out.print(obj.transactionType+" ");
            System.out.println(obj.currentBalance);
            System.out.println("<------------------>");
        }
    }
}
