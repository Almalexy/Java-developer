package main.com.Almalexy.Module_5.Middle;

import java.util.Scanner;

public class Task1MassiveSumAlt {
    public static void main(String[] args) {
        /* Задача: Задан массив целочисленных чисел, вывести сумму всех чисел массива.
        Отличие: массив задается вводом */
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int sum = 0;
        System.out.println("Введите 4 целых числа:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("Сумма всех чисел массива = " + sum);
        //конец задачи
    }
}
