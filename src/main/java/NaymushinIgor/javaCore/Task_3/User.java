package NaymushinIgor.javaCore.Task_3;

import NaymushinIgor.javaCore.Task_3.accounts.CreditAccount;
import NaymushinIgor.javaCore.Task_3.accounts.CurrentAccount;
import NaymushinIgor.javaCore.Task_3.accounts.DebitAccount;

public class User {
    private CreditAccount creditAccount;
    private CurrentAccount currentAccount;
    private DebitAccount debitAccount;


    public User(CreditAccount creditAccount, CurrentAccount currentAccount, DebitAccount debitAccount) {
        this.creditAccount = creditAccount;
        this.currentAccount = currentAccount;
        this.debitAccount = debitAccount;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public DebitAccount getDebitAccount() {
        return debitAccount;
    }
}
