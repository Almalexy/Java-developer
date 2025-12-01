package main.com.Almalexy.Module_3.Middle;

import java.util.Scanner;

public class Task2Discriminant {
    public static void main(String[] args){
        /* Задача: Посчитать дискриминант квадратного уравнения.
        Дискриминант рассчитывается по формуле D=b^2-4ac.
        Пользователем вводятся значения a, b и c.
        Нужно вывести дискриминант уравнения.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        double b = scanner.nextInt();
        System.out.print("Введите значение с: ");
        double c = scanner.nextInt();
        double D = b * b - 4 * a * c ;
        System.out.println("Дискриминант = " + D);
        // Конец задачи
    }
}
