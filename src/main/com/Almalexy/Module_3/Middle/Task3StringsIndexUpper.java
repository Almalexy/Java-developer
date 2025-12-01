package main.com.Almalexy.Module_3.Middle;

public class Task3StringsIndexUpper {
    public static void main(String[] args){
        /* Задача: Задана строка «Hello Java!».
            1. Найти номер буквы «J» при помощи операции .indexOf() (смотри конец 4 урока!)
            2. Вывести строку в верхнем регистре (то есть заглавными буквами) с помощью операции .toUpperCase()*/
        String text = "Hello Java!";
        int index = text.indexOf('J');
        System.out.println("Номер буквы 'J': " + index);
        String upper = text.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upper);
        // Конец задачи
    }
}
