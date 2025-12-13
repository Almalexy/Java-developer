package main.com.Almalexy.Module_5.Middle;

public class Task1MassiveSum {
    public static void main(String[] args) {
        /* Задача: Задан массив целочисленных чисел, вывести сумму всех чисел массива.*/
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма всех чисел массива равна: " + sum);
    }
}
