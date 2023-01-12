package BankSystem;

public interface ATMInterface { //call transaction update it
    
    Customer deposit(Customer customer);  // update account balance
    
    Customer withdraw(Customer customer); // cheak account balance and update
    
    void checkBalance(Customer customer);  // show current account balance
}
