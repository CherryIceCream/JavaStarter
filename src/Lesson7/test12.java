package Lesson7;

public class test12 {
    public static void main(String[] args) {
        String space = "У д а л я ю п р о б е л";
       char[] mas = space.toCharArray();
               for (int i = 0; i < mas.length; i++) {
            if (mas[i]==' '){
                mas[i]='';}
            System.out.print(mas[i]);
        }
    }
}
       /*
       String space = "У д а л я ю п р о б е л";
        String space2 = space.replace(" ","");
        System.out.println(space2);}
        */