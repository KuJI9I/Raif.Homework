package NaymushinIgor.javaCore.Task_3.accounts;

import NaymushinIgor.javaCore.Task_3.User;

public class CurrentAccount implements Account {
    double balance;

    public CurrentAccount(double balance) {
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
        if (amount >= 1_000_000)
            user.getDebitAccount().increaseBalance(2000);
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
