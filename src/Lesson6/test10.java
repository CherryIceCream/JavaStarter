package Lesson6;

import java.util.Arrays;
import java.util.Scanner;


public class test10 {
    public static void main (String[] args){
        int n,m;
        Scanner in = new Scanner(System.in);
        System.out.println("Введи высоту матрицы");
        n = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введи длинну матрицы");
        m = in2.nextInt();
        int[][] mat = new int [n][m];
        System.out.println("Введи "+ n*m +"чисел");
        for (int i1=0; i1<n; ++i1) {
            for (int i2=0; i2<m; ++i2){
                Scanner in3 = new Scanner(System.in);
                mat[i1][i2] = in3.nextInt();
            }
        }   System.out.print(Arrays.deepToString(mat));
    }
}
