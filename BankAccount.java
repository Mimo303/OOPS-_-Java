public class BankAccount {
    // Field
    private double balance;

    // Constructor
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }


    // Method to withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Insufficient funds for withdrawal of $" + amount);
        }else{
            System.out.println("Invalid withdrawal amount.");
        }
    }


    // Method to get current balance
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){
        // Creating an account with an initial balance of $500
        BankAccount account = new BankAccount(500.00);
        System.out.println("Initial balance: $" + account.getBalance());
        System.out.println("-----------------------------------------");

        //Perform Transactions
        account.deposit(250.00);
        account.withdraw(100.00);
        account.withdraw(700.00); // Exceeds balance check

        System.out.println("------------------------------------------");
        System.out.println("Final Balance: $" + account.getBalance());
    }
    
}
