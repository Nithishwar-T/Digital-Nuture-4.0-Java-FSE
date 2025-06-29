public class BankAccount {
    private int balance;

    public BankAccount(int initialAmount) {
        this.balance = initialAmount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
