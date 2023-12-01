public class Main {
    public static void main(String[] args) {
        SavingAccount sav1 = new SavingAccount(1, 5000, 10);
        sav1.calculateInterest();
        sav1.deposit(5000);
        System.out.println(sav1.getBalance());
        sav1.calculateInterest();
        sav1.withdraw(5000);
        System.out.println(sav1.getBalance());

        System.out.println("***********************************************");

        CurrentAccount current1 = new CurrentAccount(2, 5000, 500);
        System.out.println(current1.getBalance());
        current1.withdraw(5000);
        System.out.println(current1.getBalance());
        current1.withdraw(100);
        System.out.println(current1.getBalance());
        current1.withdraw(600);
        System.out.println(current1.getBalance());
        current1.withdraw(400);
        System.out.println(current1.getBalance());
        current1.deposit(2000);
        System.out.println(current1.getBalance());

        System.out.println("***********************************************");

        FixedDepositAccount fixed1 = new FixedDepositAccount(3, 4000, 10, 24);
        System.out.println(fixed1.getBalance());
        fixed1.calculateInterest();
        fixed1.withdraw(2000);
        System.out.println(fixed1.getBalance());
        fixed1.setFixedTerm(0);
        fixed1.deposit(2000);
        System.out.println(fixed1.getBalance());
        fixed1.calculateInterest();
        fixed1.withdraw(4000);
        System.out.println(fixed1.getBalance());
    }
}