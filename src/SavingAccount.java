public class SavingAccount extends BankAccount {
    private double interestRate;

    //constructor
    public SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // calculate interest
    public void calculateInterest() {
        double interest = (this.getBalance() * this.interestRate) / 100;
        System.out.println("Your interest is $" + interest);
    }
}
