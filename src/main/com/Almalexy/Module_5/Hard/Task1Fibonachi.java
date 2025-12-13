package main.com.Almalexy.Module_5.Hard;

import java.util.Scanner;

public class Task1Fibonachi {
    public static void main(String[] args) {
        /* Задача: Вывести на экран ряд чисел Фибоначчи,
        состоящий из N элементов. Значение N вводится с клавиатуры.
        Числа Фибоначчи – это элементы числовой последовательности
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …,
        в которой каждое последующее число равно сумме двух предыдущих.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Количество элементов должно быть больше 0.");
            return;
        }
        System.out.println("Ряд Фибоначчи из " + n + " элементов:");
        long first = 0;
        long second = 1;
        if (n >= 1) System.out.print(first + " ");
        if (n >= 2) System.out.print(second + " ");
        if (n >= 2 && 2 % 10 == 0) System.out.println();
        for (int i = 3; i <= n; i++) {
            long next = first + second;
            System.out.print(next + " ");
            if (i % 10 == 0) System.out.println();
            first = second;
            second = next;
        }
        // Конец задачи
    }
}
