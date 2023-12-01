public class CurrentAccount extends BankAccount {
    private double overDraftLimit;

    // constructor
    public CurrentAccount(int accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    private boolean checkOverdraftLimit(double amount) {
        return (this.getBalance() - amount) >= -this.overDraftLimit;  // Fixed the condition
    }

    @Override
    public void withdraw(double amount) {
        if (checkOverdraftLimit(amount)) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("$" + amount + " withdrawal successfully");
        } else {
            System.out.println("You cannot withdraw $" + amount +
                    " because it will exceed the permitted overdraft value.");
        }
    }
}
