package main.com.Almalexy.Module_4.Hard;

import java.util.Scanner;

public class Task2ChessChecker {
    public static void main(String[] args) {
        /* Задача: Заданы координаты двух фигур — пешки и слона.
        Определить, находится ли пешка под боем слона.
        Слон ходит по диагонали, а пешка находится под боем,
        если стоит на одной диагонали со слоном.
        Шахматное поле состоит из восьми клеток в ширину и в длину.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты слона (например, A1): ");
        String bishop = scanner.next().toUpperCase();
        System.out.println("Введите координаты пешки (например, H8): ");
        String pawn = scanner.next().toUpperCase();
        if (bishop.length() != 2 || pawn.length() != 2) {
            System.out.println("Ошибка: каждая координата должна состоять из 2 символов (буква и цифра).");
            return;
        }
        char bishopX = bishop.charAt(0);
        char bishopY = bishop.charAt(1);
        char pawnX = pawn.charAt(0);
        char pawnY = pawn.charAt(1);
        boolean validBishop = (bishopX >= 'A' && bishopX <= 'H') && (bishopY >= '1' && bishopY <= '8');
        boolean validPawn = (pawnX >= 'A' && pawnX <= 'H') && (pawnY >= '1' && pawnY <= '8');
        if (!validBishop || !validPawn) {
            System.out.println("Ошибка: координаты должны быть в диапазоне A–H и 1–8.");
            return;
        }
        int bishopXNum = bishopX;
        int bishopYNum = Character.getNumericValue(bishopY);
        int pawnXNum = pawnX;
        int pawnYNum = Character.getNumericValue(pawnY);
        int diffX = Math.abs(bishopXNum - pawnXNum);
        int diffY = Math.abs(bishopYNum - pawnYNum);
        if (diffX == diffY) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Конец задачи
    }
}