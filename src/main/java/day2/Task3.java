package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число a");              //5
        int a = scanner.nextInt();
        System.out.println("введите число b");              //100
        int b = scanner.nextInt();
        int c = a;
        while (c < b) {
            if (c % 5 == 0 && c % 10 != 0)
                System.out.println(c);
            c = c + 1;
        }
        if (a >= b) {
            System.out.println("Не корректный ввод");
        }

    }
}
