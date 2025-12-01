package main.com.Almalexy.Module_3.Middle;

import java.util.Scanner;

public class Task4StringLenght {
    public static void main(String[] args){
        /* Задача: Считать с консоли строку и вывести её длину на экран.
        Для этого воспользуйтесь операцией .length() */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        int length = text.length();
        System.out.println("Длина строки = " + length);
        // Конец задачи
    }
}
