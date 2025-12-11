package main.com.Almalexy.Module_4.Easy;

import java.util.Scanner;

public class Task1BlockScheme {
    public static void main(String[] args){
        /* Задача: Напишите по этой блок-схеме программу, если x = 6, а затем x = -2*/
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите X: ");
         int x = scanner.nextInt();
         int y;
         if(x>0){
             y = 2 * x;
         } else {
             y = -2 * x;
         }
         System.out.println("Y равен " + y);
        // Конец задачи
    }
}
