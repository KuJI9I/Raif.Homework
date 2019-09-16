package Task_3;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Текущий баланс " + account.getBalance());

        System.out.println("Введите сумму пополнения");
        double replAmount = scanner.nextDouble();
        account.putMoney(replAmount);

        System.out.println("Текущий баланс " + account.getBalance());

        System.out.println("Введите сумму снятия");
        double withdrAmount = scanner.nextDouble();
        account.withdrawMoney(withdrAmount);

        System.out.println("Текущий баланс " + account.getBalance());

    }


}
