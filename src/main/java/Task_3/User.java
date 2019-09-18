package Task_3;

import java.util.Collection;

public class User {
    private int id;
    private Collection<DebitAccount> debits;
    private Collection<CreditAccount> credits;
    private Collection<CurrentAccount> currents;

    DebitAccount debitAccount;
    CreditAccount creditAccount;
    CurrentAccount currentAccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<DebitAccount> getDebits() {
        return debits;
    }

    public void setDebits(Collection<DebitAccount> debits) {
        this.debits = debits;
    }

    public Collection<CreditAccount> getCredits() {
        return credits;
    }

    public void setCredits(Collection<CreditAccount> credits) {
        this.credits = credits;
    }

    public Collection<CurrentAccount> getCurrents() {
        return currents;
    }

    public void setCurrents(Collection<CurrentAccount> currents) {
        this.currents = currents;
    }


    public DebitAccount getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(DebitAccount debitAccount) {
        this.debitAccount = debitAccount;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }
}
