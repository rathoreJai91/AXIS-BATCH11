package BankSystem;

public interface AccountInterface {
    
    Account addAccount();

    void deleteAccount(Customer customer);
    
    void editAccount();
    
    void searchAccount();

    void transactionHistory();
}
