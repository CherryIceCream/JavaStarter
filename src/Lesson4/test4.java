package Lesson4;

import java.util.Scanner;
public class test4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число в двоичном виде: ");
        String str = in.nextLine();
        int decimal = Integer.parseInt(str, 2);
        System.out.print(decimal);
    }
}
