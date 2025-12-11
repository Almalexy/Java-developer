package main.com.Almalexy.Module_4.Middle;

import java.util.Scanner;

public class Task2MultipleChecker {
    public static void main(String[] args) {
        /* Задача: Вводятся два числа (большее и меньшее).
        Определить, кратно ли первое число второму,
        то есть делится ли первое число нацело на второе.
        Вывести на экран сообщение об этом, а также остаток от деления,
        если первое число не кратно второму. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max;
        int min;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else if (num1 < num2) {
            max = num2;
            min = num1;
        } else {
            System.out.println("Числа равны");
            return;
        }
        if (max % min == 0) {
            System.out.println("Число " + max + " кратно " + min + " в " + (max / min) + " раз");
        } else {
            System.out.println("Число " + max + " не кратно " + min);
            System.out.println("Остаток от деления: " + (max % min));
        }
        // Конец задачи
    }
}