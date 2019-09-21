package NaymushinIgor.javaCore.Task_5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            int a = getInt();
            char operation = getOperator();
            int b = getInt();
            int result = calculate(a, operation, b);
            System.out.println("Получен результат: " + result);
        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num;
//        if (scanner.hasNextInt()) {
//            num = scanner.nextInt();
//        } else {
//            System.out.println("Некорректное значение числа. Попробуйте еще раз.");
//            scanner.next();
//            num = getInt();
//        }
        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Некорректное значение числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    private static char getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        char operator;
        try {
            operator = scanner.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Некорректное значение операции. Попробуйте еще раз.");
            scanner.next();
            operator = getOperator();
        }
//        if (scanner.hasNext()) {
//            operator = scanner.next().charAt(0);
//        } else {
//            System.out.println("Некорректное значение операции. Попробуйте еще раз.");
//            scanner.next();
//            operator = getOperator();
//        }
        return operator;
    }


    private static int calculate(int num1, char operation, int num2) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (Exception e) {
                    System.out.println("Деление на ноль");
                    throw new ArithmeticException();
//                    result = num1 / getInt();
                }

                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculate(num1, getOperator(), num2);
        }
        return result;
    }
}
