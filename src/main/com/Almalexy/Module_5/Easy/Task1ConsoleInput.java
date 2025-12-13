package main.com.Almalexy.Module_5.Easy;

import java.util.Scanner;

public class Task1ConsoleInput {
    public static void main(String[] args) {
        /* Задача: Допишите программу, которая возводит число в целочисленную степень.
        Число и степень вводятся с клавиатуры.
        Использовать цикл для возведения в степень. */
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
//пропущенный код
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * a;
        }
        System.out.println(a + " в степени " + n + " = " + result);
        // Конец задачи
    }
}