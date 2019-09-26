package NaymushinIgor.javaCore.Task_3.accounts;

import NaymushinIgor.javaCore.Task_3.User;

public class CreditAccount implements Account {
    double balance;

    public CreditAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(User user, Account account, double amount) {
        if (amount >= 30000)
            System.out.println("Снятие наличных запрещено");
        else
        balance -= amount;
    }

    @Override
    public void putMoney(User user, Account account, double amount) {
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
