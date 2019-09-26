package NaymushinIgor.javaCore.Task_3;

import NaymushinIgor.javaCore.Task_3.accounts.CreditAccount;
import NaymushinIgor.javaCore.Task_3.accounts.CurrentAccount;
import NaymushinIgor.javaCore.Task_3.accounts.DebitAccount;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();
        CreditAccount creditAccount = new CreditAccount(-100000);
        CurrentAccount currentAccount = new CurrentAccount(10000);
        DebitAccount debitAccount = new DebitAccount(10000);

        User user = new User(creditAccount, currentAccount, debitAccount);
        System.out.println(debitAccount.getBalance());
        atm.getMoney(user, user.getDebitAccount(), 5000);
        System.out.println(debitAccount.getBalance());

        System.out.println(currentAccount.getBalance());
        System.out.println(debitAccount.getBalance());
        atm.putMoney(user, user.getCurrentAccount(), 1_000_000);
        System.out.println(debitAccount.getBalance());
        System.out.println(currentAccount.getBalance());

        atm.getMoney(user, user.getCurrentAccount(), 30000);
        System.out.println(currentAccount.getBalance());
    }
}
