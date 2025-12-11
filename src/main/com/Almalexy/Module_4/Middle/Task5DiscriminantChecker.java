package main.com.Almalexy.Module_4.Middle;

import java.util.Scanner;

public class Task5DiscriminantChecker {
    public static void main(String[] args) {
        /* Задача: 5. Написать программу, которая будет определять,
        есть ли действительные корни у квадратного уравнение.
        Квадратное уравнение можно записать следующим образом: ax^2+bx+c=0.
        Пользователь вводит параметры a, b и c.
        Если дискриминант квадратного уравнения больше или равен 0,
        то уравнение имеет действительные корни, если дискриминант меньше нуля,
        то уравнение не имеет корней.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения a, b и c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = b * b - 4 * a * c;
        if (D >= 0) {
            System.out.println("Есть действительные корни");
        } else {
            System.out.println("Нет действительных корней");
        }
        // Конец задачи
    }
}