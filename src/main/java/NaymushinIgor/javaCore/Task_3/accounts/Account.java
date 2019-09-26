package NaymushinIgor.javaCore.Task_3.accounts;

import NaymushinIgor.javaCore.Task_3.User;

public interface Account {
    void withdrawMoney(User user, Account account, double amount);

    void putMoney(User user, Account account, double amount);

    double getBalance();

}
