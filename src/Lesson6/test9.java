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
        int[] mas2 = new int[n];
        System.out.println("Введи " +n+ " чисел построчно");
        for (int i=0; i<n; i++) {
        Scanner in2 = new Scanner(System.in);
        mas[i] = in2.nextInt();
        mas2[i]=2*mas[i];
        }
        System.out.println("Получи массив с х2 числами"+Arrays.toString(mas2));
    }
}

