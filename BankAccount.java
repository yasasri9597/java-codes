class BankAccount {
    private String holder;
    private double balance;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) balance -= amt;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return holder + " | Balance: " + balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Praveen", 5000);

        acc.deposit(1200);
        acc.withdraw(800);

        System.out.println(acc);
    }
}
