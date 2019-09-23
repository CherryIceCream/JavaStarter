import java.util.Scanner;

public class test {
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введи число: ");
        int number = s.nextInt();
        int X = 5;
        int Y = 156;
        int Z = 229;
        boolean c = (number==X||number==Y||number==Z);

        String a = "Данное значение имеется в константах";
        String b = "Такой константы нет";
        System.out.println(c ? a : b);
            }
    }