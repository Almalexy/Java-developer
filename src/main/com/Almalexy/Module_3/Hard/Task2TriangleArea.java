package main.com.Almalexy.Module_3.Hard;

import java.util.Scanner;

public class Task2TriangleArea {
    public static void main(String[] args) {
        /* Задача: Заданы координаты вершин треугольника,
        необходимо вычислить площадь.
        Для этого сначала необходимо найти длины сторон треугольника,
        а затем вычислить площадь треугольника по длинам сторон. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты вершины A (xA yA): ");
        double xA = scanner.nextDouble();
        double yA = scanner.nextDouble();
        System.out.print("Введите координаты второй вершины (xB yB): ");
        double xB = scanner.nextDouble();
        double yB = scanner.nextDouble();
        System.out.print("Введите координаты третьей вершины (xC yC): ");
        double xC = scanner.nextDouble();
        double yC = scanner.nextDouble();
        double a = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
        double b = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
        double c = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
        double P = (a + b + c) / 2;
        double area = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        System.out.println("Площадь треугольника = " + area);
        // Конец задачи
    }
}
