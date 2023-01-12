package BankSystem;

import java.util.Scanner;

public class MainWindow {
    Bank bankObj = new Bank();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MainWindow mainWindow = new MainWindow();
        
        while(true){
            System.out.println("Select Choice \n 1: ADD CUSTOMER\n 2: DEPOSIT\n 3: CHECKBALANCE\n 4: WITHDRAW\n 5: TRANSACTION HISTORY\n 6: DELETE ACCOUNT\n 7: SEARCH ACCOUNT");
            int choice = s.nextInt();
            switch(choice){
                case 1 :
                    Customer customer = new Customer();
                    customer.addCustomer();
                    mainWindow.bankObj.map.put(customer.account.accNumber,customer);
                    System.out.println("Account Added.");
                    break;
                case 2 : 
                    System.out.println("Enter Account No.");
                    long accNum = s.nextLong();
                    if(mainWindow.bankObj.map.containsKey(accNum)){
                        ATM atmobj = new ATM();
                        mainWindow.bankObj.map.put(accNum, atmobj.deposit(mainWindow.bankObj.map.get(accNum)));
                    }else{
                        System.out.println("Invalid Account number!");
                    }
                    break;
                case 3 : 
                    System.out.println("Enter Account No.");
                    long accNum1 =s.nextLong();
                    if(mainWindow.bankObj.map.containsKey(accNum1)){
                        ATM atmobj = new ATM();
                        atmobj.checkBalance(mainWindow.bankObj.map.get(accNum1));
                    }else{
                        System.out.println("Invalid Account number!");
                    }
                    break;
                case 4 : 
                    System.out.println("Enter Account No.");
                    long accNum2 = s.nextLong();
                    if(mainWindow.bankObj.map.containsKey(accNum2)){
                        ATM atmobj = new ATM();
                        mainWindow.bankObj.map.put(accNum2, atmobj.withdraw(mainWindow.bankObj.map.get(accNum2)));
                    }else{
                        System.out.println("Invalid Account number!");
                    }
                    break;
                case 5 :
                    System.out.println("Enter Account No.");
                    long accNum3 = s.nextLong();
                    if(mainWindow.bankObj.map.containsKey(accNum3)){
                        mainWindow.bankObj.map.get(accNum3).account.transactionHistory();
                    }else{
                        System.out.println("Invalid Account number!");
                    }
                    break;
                case 6 :
                    System.out.print("Enter Account No. :");
                    long accNum4 = s.nextLong();
                    if(mainWindow.bankObj.map.containsKey(accNum4)){
                        Customer customer1 = mainWindow.bankObj.map.get(accNum4);
                        customer1.deleteCustomer();
                        mainWindow.bankObj.map.remove(accNum4);
                    }else{
                        System.out.println("Invalid Account number!");
                    }
                    break;
                case 7 :
                    System.out.print("Enter Account No. :");
                    long accNum5 =s.nextLong();
                    if(mainWindow.bankObj.map.containsKey(accNum5)){
                        Customer customer2 = mainWindow.bankObj.map.get(accNum5);
                        customer2.account.searchAccount();
                    }else{
                        System.out.println("Account not Found.");
                    }
                case 8 :
                    System.exit(1);
                    break;
                default : System.out.println("Wrong Choice");
            }
            
        }
    }
}
