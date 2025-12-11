package main.com.Almalexy.Module_4.Middle;

import java.util.Scanner;

public class Task3TriangleToBeOrNotToBe {
    public static void main(String[] args) {
        /* Задача: Заданы длины сторон треугольника.
        Необходимо определить, может ли существовать треугольник с такими сторонами.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины трёх сторон треугольника:");
        int aSide = scanner.nextInt();
        int bSide = scanner.nextInt();
        int cSide = scanner.nextInt();
        if (aSide + bSide > cSide && aSide + cSide > bSide && bSide + cSide > aSide) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        // Конец задачи
    }
}