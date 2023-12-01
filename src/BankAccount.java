public class BankAccount {
    // attributes
    private int accountNumber;
    private double balance;

    // constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //setters and getters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // withdraw
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("$" + amount + " withdrawal successfully");
        } else {
            System.out.println("Your balance is " + this.balance + " you can not withdraw $" + amount);
        }
    }
    // Deposit
    public void deposit(double amount){
        this.balance+= amount;
        System.out.println("$" + amount + " deposited successfully");
    }
}
