package main.com.Almalexy.Module_3.Middle;

import java.util.Scanner;

public class Task1MonthlySalary {
    public static void main(String[] args){
        /*Необходимо посчитать зарплату рабочего за месяц.
        На консоль вводится, сколько дней в месяце было отработано,
        дальше вводится вещественное число — зарплата за день.
        Нужно вывести зарплату рабочего за весь месяц.
        Например, если в месяце было отработано 10 дней,
        а зарплата в день была 5500.25 рублей,
        то программа должна вывести в результате — 55002.5*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество отработанных дней: ");
        int days = scanner.nextInt();
        System.out.print("Введите зарплату за день: ");
        double daySalary = scanner.nextDouble();
        double total = days * daySalary;
        System.out.print("Суммарная зарплата рабочего за " + days + " дней составляет " + total + " рублей");
        // Конец задачи
    }
}
