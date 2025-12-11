package main.com.Almalexy.Module_4.Middle;

import java.util.Scanner;

public class Task1MMMNumbers {
    public static void main(String[] args) {
        /* Задача: Определить, какое из трёх введённых пользователем
        значений наименьшее, наибольшее, среднее.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = Math.max(num1, Math.max(num3, num2));
        int min = Math.min(num1, Math.min(num3, num2));
        int mid = num1 + num2 + num3 - max - min;
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("mid: " + mid);
        // Конец задачи
    }
}
