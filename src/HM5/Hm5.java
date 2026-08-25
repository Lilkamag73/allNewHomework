package HM5;

import java.util.Scanner;

public class Hm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8(scanner);
        task9(scanner);
        task10();
        scanner.close();


    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8(Scanner scanner) {
        System.out.println("Задача 8");
        int contribution = 29000;
        int total = 0;
        System.out.println("Введите количество месяцев:");
        int month = scanner.nextInt();
        for (int i = 1; i <= month; i++) {
            total += contribution;
            System.out.println("За " + i + " месяц вы получите " + total);
        }
    }

    public static void task9(Scanner scanner) {
        System.out.println("Задача 9");
        double total = 0;
        int contribution = 29000;
        System.out.println("Введите количество месяцев:");
        int month = scanner.nextInt();
        for (int i = 1; i <= month; i++) {
            total = total + total * 0.01;
            total += contribution;
            System.out.println("За " + i + " месяц вы получите " + total);
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            int result = a * i;
            System.out.println(a + " * " + i + " = " + result);
        }
    }
}