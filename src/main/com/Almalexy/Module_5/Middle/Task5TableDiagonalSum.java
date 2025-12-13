package main.com.Almalexy.Module_5.Middle;

import java.util.Scanner;

public class Task5TableDiagonalSum {
    public static void main(String[] args) {
        /* Задача: Задан двумерный массив размера N на N,
        где N находится в пределах от 1 до 10. Каждый элемент массива — число.
        Необходимо вывести сумму чисел, которые находятся на главной диагонали массива.
        Главная диагональ - это элементы с индексами 0:0, 1:1, 2:2 … N:N.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер таблицы в пределах от 1 до 10: ");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Каким бы ни было содержимое ячейки сумма главной диагонали будет равна этому содержимому,");
            System.out.println("так как содержимое можно представить в виде суммы самого содержимого и нуля например: х = х + 0");
        } else if (n < 1 || n > 10) {
            System.out.println("Неверный ввод, таблица должна быть от 1 до 10.");
        } else {
            int[][] table = new int[n][n];
            System.out.println("Введите элементы матрицы построчно:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    table[i][j] = scanner.nextInt();
                }
            }
            int sum = 0;
            System.out.print("Элементы главной диагонали: ");
            for (int i = 0; i < n; i++) {
                sum += table[i][i];
                System.out.print(table[i][i] + " ");
            }
            System.out.println("Сумма элементов главной диагонали = " + sum);
        }
        // Конец задачи
    }
}