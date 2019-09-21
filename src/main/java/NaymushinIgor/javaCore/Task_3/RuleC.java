package NaymushinIgor.javaCore.Task_3;

public class RuleC implements Rule {
    public boolean check(User user, Account from, Account to, double amount) {
        if (from == null && to != null && to.equals(user.getCurrentAccount()) && amount > 1000000) {
            to.putMoney(amount);
            user.getDebitAccount().putMoney(2000);
            return true;
        }
        return false;
    }
}
