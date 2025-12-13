package main.com.Almalexy.Module_5.Middle;

import java.util.Scanner;

public class Task2MassiveMaxModuleValue {
    public static void main(String[] args) {
        /* Задача: В массиве, состоящем из N вещественных элементов
        найти максимальный по модулю элемент массива.
        N может принимать значение от 1 до 100. Пример:*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива (1–100): ");
        int n = scanner.nextInt();
        double[] num = new double[n];
        System.out.println("Введите " + n + " вещественных чисел:");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextDouble();
        }
        if (n == 1) {
            System.out.print("В массиве всего одно число " + num[0]);
            System.out.print(", модуль которого по определению не может быть меньше или больше");
            return;
        }
        double max = num[0];
        for (int i = 1; i < n; i++) {
            if (Math.abs(num[i]) > Math.abs(max)) {
                max = num[i];
            }
        }
        boolean negativeValue = false;
        for (int i = 0; i < n; i++) {
            if (num[i] == -max) {
                negativeValue = true;
                break;
            }
        }
        if (negativeValue) {
            System.out.println("Максимальные по модулю числа: " + max + " и " + (-max));
        } else {
            System.out.println("Максимальное по модулю число: " + max);
        }
        // Конец задачи
    }
}