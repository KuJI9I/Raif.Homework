package Task_1;

import java.util.Random;
import java.util.Scanner;

public class HotOrCold {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приложение Горячо-Холодно");
        System.out.println("Сгенерируем случайное число, для этого введем два числа для ограничения диапазона");
        System.out.println("Введите первое число ");
        int min = scanner.nextInt();
        System.out.println("Введите второе число ");
        int max = scanner.nextInt();
        int result = random.nextInt((max - min) + 1) + min;
        System.out.println("Перейдем к игре");
        System.out.println("Случайное число = " + result);
        int prev = min;
        while (true) {
            System.out.println("Введите число ");
            int current = scanner.nextInt();
            if (current == result) {
                System.out.println("Успех");
                break;
            //dt - имеет смысл зарефакторить, чтобы код читался
            } else if (Math.abs(result - prev) >= (Math.abs(result - current))) {
                System.out.println("Горячо");
            } else if (Math.abs(result - prev) < (Math.abs(result - current))) {
                System.out.println("Холодно");
            }
            prev = current;
        }
    }
}
