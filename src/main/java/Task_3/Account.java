package Task_3;

class Account {
    String type;
    private double balance= 10000.30;

    void putMoney(double amount) {
        this.balance = this.balance + amount;
    }

    void withdrawMoney(double amount) {
        this.balance = this.balance - amount;
    }

    double getBalance() {
        return balance;
    }
}
