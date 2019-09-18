package Task_3;

public class RuleA implements Rule {

    public boolean check(User user, Account from, Account to, double amount) {
        if (from != null & to == null && amount >= 30000) {
            System.out.println("Снятие наличных запрещено");
            return false;
        }
        return true;
    }
}
