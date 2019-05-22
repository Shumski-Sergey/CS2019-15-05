package maksimvoznyuk;

import java.util.Scanner;

public class Lesson2TaskB1 {
    public static void main (String args []) {

        System.out.println("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int b = a * a;

        System.out.println("Квадрат числа " + a + " равен " + b);

    }
}
