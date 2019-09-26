package NaymushinIgor.javaCore.Task_3.accounts;

import NaymushinIgor.javaCore.Task_3.User;

public class DebitAccount implements Account {
    private double balance;


    public DebitAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(User user, Account account, double amount) {
        if (user.getCreditAccount().getBalance() < -20000) {
            System.out.println("Дебитовый аккаунт заблокирован из-за отрицательного кредитного баланса, составляющего = "
                    + user.getCreditAccount().getBalance());
        } else if (amount >= 30000) {
            System.out.println("Снятие наличных запрещено");
        } else
            balance -= amount;
    }

    @Override
    public void putMoney(User user, Account account, double amount) {
        if (user.getCreditAccount().getBalance() < -20000)
            System.out.println("Account blocked");
        else
            balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void increaseBalance(double amount) {
        balance += amount;
    }
}
