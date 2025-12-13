package main.com.Almalexy.Module_5.Hard;

import java.util.Scanner;

public class Task2AntiDuplicator {
    public static void main(String[] args) {
        /* Задача: Создать программу, которая из заданного массива
        будет удалять все повторяющиеся элементы (порядок не важен).
        С консоли вводится в первой строке длина массива,
        а во второй строке — элементы массива.
        Длина массива не более 1000 элементов,
        значение каждого элемента массива положительно и не превышает 1000.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива от 1 до 1000: ");
        int n = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int[] input = new int[n];
        int[] seen = new int[1001];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
            if (input[i] >= 0 && input[i] <= 1000) {
                seen[input[i]] = 1;
            }
        }
        System.out.print("Вывод: ");
        for (int i = 0; i <= 1000; i++) {
            if (seen[i] == 1) {
                System.out.print(i + " ");
            }
        }
        // Конец задачи
    }
}