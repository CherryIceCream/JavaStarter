package Lesson4;

import java.util.Scanner;

public class test5 {
   public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       System.out.print("Input a number: ");
       int z = in.nextInt();

       System.out.printf("Your number: %d \n", z);
       in.close();


       int a1 = z*1;
       int a2 = z*2;
       int a3 = z*3;
       int a4 = z*4;
       int a5 = z*5;
       int a6 = z*6;
       int a7 = z*7;
       int a8 = z*8;
       int a9 = z*9;
       int a10 = z*10;
       System.out.println(a1);
       System.out.println(a2);
       System.out.println(a3);
       System.out.println(a4);
       System.out.println(a5);
       System.out.println(a6);
       System.out.println(a7);
       System.out.println(a8);
       System.out.println(a9);
       System.out.println(a10);
   }
}
