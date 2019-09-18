package Task_3;

public abstract class BaseAccount implements Account{
    private double balance;

    public void putMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
