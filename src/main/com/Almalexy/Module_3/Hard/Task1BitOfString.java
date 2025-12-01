package main.com.Almalexy.Module_3.Hard;

public class Task1BitOfString {
    public static void main(String[] args) {
        /* Задача: Задана строка «Hello world!». Вывести подстроку с 6 по 11 символ. */
        String fullText = "Hello world!";
        String textBit = fullText.substring(6, 11);
        System.out.println("Подстрока: " + textBit);
        // Конец задачи
    }
}
