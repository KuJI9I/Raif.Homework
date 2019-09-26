package NaymushinIgor.javaCore.Task_3;

import NaymushinIgor.javaCore.Task_3.accounts.Account;

import java.util.Collections;
import java.util.List;

public class User {
    private int id;
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
