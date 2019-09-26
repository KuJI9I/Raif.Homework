package NaymushinIgor.javaCore.Task_3;

import NaymushinIgor.javaCore.Task_3.accounts.Account;

public class Atm {

    void putMoney(User user, Account account, double amount) {
        account.putMoney(user, account, amount);
    }

    void getMoney(User user, Account account, double amount) {
        account.withdrawMoney(user, account, amount);
    }

    void transferMoney(User user, Account from, Account to, double amount) {
        from.withdrawMoney(user, from, amount);
        to.putMoney(user, to, amount);
    }
}
