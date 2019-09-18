package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Atm {

    private List<Rule> rules = new ArrayList<Rule>();

    public static void main(String[] args) {
        Atm atm = new Atm();
        CurrentAccount currentAccount = new CurrentAccount();
        CreditAccount creditAccount = new CreditAccount();
        DebitAccount debitAccount = new DebitAccount();
        User user = new User();
        user.setCurrentAccount(currentAccount);
        user.setCreditAccount(creditAccount);
        user.setDebitAccount(debitAccount);
        atm.checkAll(user,user.getCreditAccount(), user.getDebitAccount(), 30000);

    }

    boolean checkAll(User user, Account from, Account to, double amount) {
        for (Rule item : rules) {
            if (!item.check(user, null, to, amount)) {
                return false;
            }
        }
        return true;
    }

    public void put(User user, Account to, double amount) {
        if (checkAll(user, null, to, amount)) {
            to.putMoney(amount);
        }
    }


    public void get(User user, Account from, double amount) {
        for (Rule item : rules) {
            item.check(user, from, null, amount);
        }

    }

    public void transfer(User user, Account from, Account to, double amount) {
        for (Rule item : rules) {
            item.check(user, from, to, amount);
        }

    }
}
