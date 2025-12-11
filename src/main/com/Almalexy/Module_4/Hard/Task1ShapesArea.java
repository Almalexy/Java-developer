package main.com.Almalexy.Module_4.Hard;

import java.util.Scanner;

public class Task1ShapesArea {
    public static void main(String[] args) {
        /* Задача: Написать программу, которая в зависимости от выбора пользователя
        вычисляет площадь одной из трёх геометрических фигур: прямоугольника,
        треугольника или круга.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("|===========================|");
        System.out.println("Выберите фигуру для вычисления площади:");
        System.out.println("|---------------------------|");
        System.out.println("1 — Прямоугольник");
        System.out.println("2 — Треугольник");
        System.out.println("3 — Круг");
        System.out.println("|---------------------------|");
        System.out.print("Ввод: ");
        int choice = scanner.nextInt();
        switch (choice) {
            // Прямоугольник
            case 1 -> {
                System.out.println("|===========================|");
                System.out.println("Выберите известные данные:");
                System.out.println("|---------------------------|");
                System.out.println("1 — две стороны");
                System.out.println("2 — сторона и диагональ");
                System.out.println("|---------------------------|");
                System.out.print("Ввод: ");
                int rectChoice = scanner.nextInt();
                if (rectChoice == 1) {
                    System.out.println("|===========================|");
                    System.out.println("Введите длину стороны a: ");
                    System.out.println("|---------------------------|");
                    System.out.print("Ввод: ");
                    double a = scanner.nextDouble();
                    System.out.println("|---------------------------|");
                    System.out.println("Введите длину стороны b: ");
                    System.out.println("|---------------------------|");
                    System.out.print("Ввод: ");
                    double b = scanner.nextDouble();
                    double area = a * b;
                    System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                    System.out.println("Площадь прямоугольника = " + area);
                    System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                } else if (rectChoice == 2) {
                    System.out.println("|===========================|");
                    System.out.println("Введите длину стороны: ");
                    System.out.println("|---------------------------|");
                    System.out.print("Ввод: ");
                    double a = scanner.nextDouble();
                    System.out.println("|---------------------------|");
                    System.out.println("Введите длину диагонали: ");
                    System.out.println("|---------------------------|");
                    System.out.print("Ввод: ");
                    double b = scanner.nextDouble();
                    double c = Math.sqrt(b * b - a * a);
                    double area = a * c;
                    System.out.println("|---------------------------|");
                    System.out.println("Вторая сторона = " + c);
                    System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                    System.out.println("Площадь прямоугольника = " + area);
                    System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                } else {
                    System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                    System.out.println("Неверный выбор.");
                    System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                }
            }
            // Треугольник
            case 2 -> {
                System.out.println("|===========================|");
                System.out.println("Выберите набор известных данных:");
                System.out.println("|---------------------------|");
                System.out.println("1 — три стороны");
                System.out.println("2 — сторона и прилегающая высота");
                System.out.println("3 — две стороны и угол между ними");
                System.out.println("|---------------------------|");
                System.out.print("Ввод: ");
                int triChoice = scanner.nextInt();
                switch (triChoice) {
                    case 1 -> {
                        System.out.println("|===========================|");
                        System.out.println("Введите стороны a, b и с: ");
                        System.out.println("|---------------------------|");
                        System.out.print("Ввод: ");
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        double c = scanner.nextDouble();
                        double p = (a + b + c) / 2;
                        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                        System.out.println("Площадь треугольника = " + area);
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                    }
                    case 2 -> {
                        System.out.println("|===========================|");
                        System.out.println("Введите известную сторону: ");
                        System.out.println("|---------------------------|");
                        System.out.print("Ввод: ");
                        double a = scanner.nextDouble();
                        System.out.println("|---------------------------|");
                        System.out.println("Введите высоту: ");
                        System.out.println("|---------------------------|");
                        System.out.print("Ввод: ");
                        double h = scanner.nextDouble();
                        double area = 0.5 * a * h;
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                        System.out.println("Площадь треугольника = " + area);
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                    }
                    case 3 -> {
                        System.out.println("|===========================|");
                        System.out.println("Введите стороны a и b: ");
                        System.out.println("|---------------------------|");
                        System.out.print("Ввод: ");
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        System.out.println("|---------------------------|");
                        System.out.println("Введите угол между a и b (в градусах): ");
                        System.out.println("|---------------------------|");
                        System.out.print("Ввод: ");
                        double angle = scanner.nextDouble();
                        double radians = Math.toRadians(angle);
                        double area = 0.5 * a * b * Math.sin(radians);
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                        System.out.println("Площадь треугольника = " + area);
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                    }
                    default -> {
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                        System.out.println("Неверный выбор.");
                        System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                    }
                }
            }
            // Круг
            case 3 -> {
                System.out.println("|===========================|");
                System.out.println("Введите радиус круга: ");
                System.out.println("|---------------------------|");
                System.out.print("Ввод: ");
                double r = scanner.nextDouble();
                double area = Math.PI * r * r;
                System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                System.out.println("Площадь круга = " + area);
                System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
            }
            default -> {
                System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
                System.out.println("Ошибка ввода.");
                System.out.println("|+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
            }
        }
        // Конец задачи
    }
}