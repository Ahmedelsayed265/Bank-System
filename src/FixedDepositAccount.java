public class FixedDepositAccount extends SavingAccount {
    private int fixedTerm;

    //constructor
    public FixedDepositAccount(int accountNumber, double balance, double interestRate, int fixedTerm) {
        super(accountNumber, balance, interestRate);
        this.fixedTerm = fixedTerm;
    }

    public void setFixedTerm(int fixedTerm) {
        this.fixedTerm = fixedTerm;
    }

    public int getFixedTerm() {
        return fixedTerm;
    }

    @Override
    public void withdraw(double amount) {
        if (fixedTerm == 0 ){
            super.withdraw(amount);
        }
        else {
            System.out.println("you can not withdraw this amount ($" + amount + ") until the " + fixedTerm + " period ends");
        }
    }
}
