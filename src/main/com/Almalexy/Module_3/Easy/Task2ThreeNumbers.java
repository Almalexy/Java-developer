package main.com.Almalexy.Module_3.Easy;

import java.util.Scanner;

public class Task2ThreeNumbers {
    public static void main(String[] args) {
        /*Считать с консоли три вещественных числа,
        вывести их сумму и произведение.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double sum = a + b + c;
        double product = a * b * c;
        System.out.println("Сумма чисел = " + sum);
        System.out.println("Произведение чисел = " + product);
        // Конец задачи
    }
}