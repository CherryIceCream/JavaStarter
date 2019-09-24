import java.util.Scanner;

public class test {
    private static final int X = 5;
    private static final int Y = 229;
    private static final int Z = 667;
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введи число: ");
        int number = s.nextInt();
        boolean c = (number==X||number==Y||number==Z);

        String a = "Данное значение имеется в константах";
        String b = "Такой константы нет";
        System.out.println(c ? a : b);
            }
    }