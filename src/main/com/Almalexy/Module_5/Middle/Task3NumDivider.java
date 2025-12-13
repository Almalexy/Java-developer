package main.com.Almalexy.Module_5.Middle;

import java.util.Scanner;

public class Task3NumDivider {
    public static void main(String[] args) {
        /* Задача: Для каждого натурального числа в промежутке от N вывести все делители,
        кроме единицы и самого числа. Значение N вводятся с клавиатуры.
        N может принимать значение от 1 до 100.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N (1–100): ");
        int n = scanner.nextInt();
        System.out.print("Делители числа " + n + ": ");

        boolean hasDivisors = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                hasDivisors = true;
            }
        }

        if (!hasDivisors) {
            System.out.print("нет (число простое)");
        }
        // Конец задачи
    }
}
