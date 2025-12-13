package main.com.Almalexy.Module_5.Middle;

import java.util.Scanner;
import java.util.Random;

public class Task6MultiplicationTable {
    public static void main(String[] args) {
        /* Задача: Написать программу для проверки знания таблицы умножения.
        Для этого необходимо сгенерировать числа А и В при помощи

        new Random().nextInt()

        (смотри урок 4). Затем перемножить их и сохранить в переменную С.
        Далее выведите на экран вопрос: “Сколько будет A * B?”.
        Пользователь вводит ответ. Необходимо считать ответ пользователя и проверить,
        правильно ли он ответил. Выведите 5 примеров из таблицы умножения.*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            String order;
            switch (i) {
                case 1 -> order = "первый";
                case 2 -> order = "второй";
                case 3 -> order = "третий";
                case 4 -> order = "четвёртый";
                case 5 -> order = "пятый";
                default -> order = " ";
            }
            int a = random.nextInt(10) + 1; // числа от 1 до 10
            int b = random.nextInt(10) + 1;
            int correctAnswer = a * b;
            System.out.println("Решите " + order + " пример: " + a + " * " + b);
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                System.out.println("Ответ верный");
            } else {
                System.out.println("Ответ неверный. " + a + " * " + b + " = " + correctAnswer);
            }
        }
        // Конец задачи
    }
}
