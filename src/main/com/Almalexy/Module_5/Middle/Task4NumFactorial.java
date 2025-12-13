package main.com.Almalexy.Module_5.Middle;

import java.util.Scanner;

public class Task4NumFactorial {
    public static void main(String[] args) {
        /* Задача: Вычислить факториал числа, которое ввёл пользователь.
        Факториал числа представляет собой произведение всех натуральных чисел
        от 1 до этого числа включительно. Например, факториал числа 7 вычисляется так:
        1 * 2 * 3 * 4 * 5 * 6 * 7*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + n + " равен: " + factorial);
        // Конец задачи
    }
}
