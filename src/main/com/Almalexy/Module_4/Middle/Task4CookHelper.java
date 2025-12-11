package main.com.Almalexy.Module_4.Middle;

import java.util.Scanner;

public class Task4CookHelper {
    public static void main(String[] args) {
        /* Задача: Нужно написать программу — помощника по кухне.
        Помощник должен определять, какое блюдо можно приготовить из имеющихся продуктов.
        В программу сначала вводятся продукты. А далее нужно определить,
        возможно ли из имеющихся продуктов приготовить яичницу, омлет или кофе.
        Для омлета требуется молоко и яйца, для яичницы только яйца, для кофе — кофе и молоко.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите доступные продукты через пробел:");
        String input = scanner.nextLine();
        boolean eggs = input.contains("яйца");
        boolean milk = input.contains("молоко");
        boolean hasCoffee = input.contains("кофе");
        System.out.println("Доступные к приготовлению рецепты:");
        if (eggs && milk)
            System.out.println("омлет");
        if (eggs)
            System.out.println("яичница");
        if (hasCoffee && milk)
            System.out.println("кофе");
        if (!eggs && !milk && !hasCoffee)
            System.out.println("Error 422");
        // Конец задачи
    }
}
