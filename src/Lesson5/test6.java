package Lesson5;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введи число: ");
        double x = s.nextDouble ();
        System.out.print("Введи еще одно: ");
        double y = s.nextDouble ();
        System.out.print("и еще одно: ");
        double z = s.nextDouble ();
        double f = (x+y+z)/3;
        double e = f%2;
        double e1 = (f-e)/2;

        System.out.println(f);
        System.out.println(e1);
        if (e1>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}





/*
* Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры x, y, z
2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
* */
