package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число a");
        int a = scanner.nextInt();
        System.out.println("введите число b");
        int b = scanner.nextInt();

        for (int i = a; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
        if (a >= b) {
            System.out.println("Не корректный ввод");
        }

    }
}
