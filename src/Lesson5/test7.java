package Lesson5;

import java.util.Scanner;

public class test7 {
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введи число: ");
        int number = s.nextInt();
        int X = 5;
        int Y = 156;
        int Z = 229;
        if (number == X) {
            System.out.println("Данное значение имеется в константах");
        } else if (number == Y) {
            System.out.println("Данное значение имеется в константах");
        } else if (number == Z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет");}
        }
    }