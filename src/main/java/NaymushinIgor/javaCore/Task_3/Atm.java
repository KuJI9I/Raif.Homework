package NaymushinIgor.javaCore.Task_3;

import NaymushinIgor.javaCore.Task_3.accounts.Account;
import NaymushinIgor.javaCore.Task_3.accounts.CreditAccount;
import NaymushinIgor.javaCore.Task_3.accounts.CurrentAccount;
import NaymushinIgor.javaCore.Task_3.accounts.DebitAccount;
import NaymushinIgor.javaCore.Task_3.rules.Rule;
import NaymushinIgor.javaCore.Task_3.rules.RuleA;

import java.util.HashMap;
import java.util.Map;

public class Atm {


    private static Map<Class<? extends Account>, Map<Class<? extends Account>, Rule>> rulesMap = new HashMap<>();


    public static void main(String[] args) {
        Atm atm = new Atm();
        init();

    }


    public void put(User user, Account to, double amount) {
        applyRules(null, to);

    }


    public void get(User user, Account from, double amount) {


    }

    public void transfer(User user, Account from, Account to, double amount) {

    }

    private static void init() {
        addRule(CreditAccount.class, null, new RuleA());
        addRule(DebitAccount.class, null, new RuleA());
        addRule(CurrentAccount.class, null, new RuleA());
    }

    private static void addRule(Class<? extends Account> from, Class<? extends Account> to, Rule rule) {
        Map<Class<? extends Account>, Rule> tmpMap = rulesMap.get(from);
        if (tmpMap == null) {
            tmpMap = new HashMap<>();
        }
        tmpMap.put(to, rule);
        if (!rulesMap.containsKey(from)) {
            rulesMap.put(from, tmpMap);
        }
    }

    private static void applyRules(Account from, Account to) {

    }
}
