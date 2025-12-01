package main.com.Almalexy.Module_3.Easy;

import java.util.Scanner;

public class Task1ConsoleReplacement {
    public static void main(String[] args){
        /* Задача: Считать с консоли два числа (int) в переменные a и b,
        обменять значения переменных и вывести на экран.
        Например, если с консоли вводятся значения a=2 а b=5,
        то нужно поменять значения переменных местами: a=5, b=2.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("После обмена: a = " + a + ", b = " + b);
        // Конец задачи
    }
}
