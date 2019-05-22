package maksimvoznyuk;

import java.util.Scanner;

public class Lesson2TaskC1 {
    public static void main (String args []){
        System.out.println ("Введите число 1: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println ("Введите число 2: ");
        int b = scan.nextInt();

        int c = a + b;
        System.out.println ("Сумма равна " + c);
    }
}
