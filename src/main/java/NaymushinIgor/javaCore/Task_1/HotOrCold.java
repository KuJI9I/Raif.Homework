package NaymushinIgor.javaCore.Task_1;

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
        int targetValue = random.nextInt((max - min) + 1) + min;
        System.out.println("Перейдем к игре");
        System.out.println("Случайное число = " + targetValue);
        int prev = min;
        while (true) {
            System.out.println("Введите число ");
            int enteredNumber = scanner.nextInt();
            if (enteredNumber == targetValue) {
                System.out.println("Успех");
                break;
            } else {
                int prevDistance = Math.abs(targetValue - prev);
                int currentDistance = Math.abs(targetValue - enteredNumber);
                if (prevDistance >= currentDistance) {
                    System.out.println("Горячо");
                } else {
                    System.out.println("Холодно");
                }
            }
            prev = enteredNumber;
        }
    }


}
