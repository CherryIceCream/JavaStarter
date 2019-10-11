package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введи длину массива");
        n = in.nextInt();

        int[] mas =new int[n];
        System.out.println("Введи " +n+ " чисел построчно");
        for (int i=0; i<n; i++) {
        Scanner in2 = new Scanner(System.in);
        mas[i] = 2* in2.nextInt();
        }
        System.out.println("Получи массив с х2 числами"+ Arrays.toString(mas));
    }
}

