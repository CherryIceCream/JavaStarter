package Lesson5;

import java.util.Scanner;

public class test7 {
    private static final int X = 5;
    private static final int Y = 229;
    private static final int Z = 667;

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введи число: ");
        int number = s.nextInt();

        String a1;
        switch (number) {
            case X:
            case Y:
            case Z:
                a1 = "Данное значение имеется в константах";
            break;
            default: a1 = "Такой константы нет!";
            break;
        }
        System.out.println(a1);
        }
    }

