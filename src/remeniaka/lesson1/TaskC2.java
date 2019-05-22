package remeniaka.lesson1;

import java.util.Scanner;
public class TaskC2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");

        int a = sc.nextInt();

        System.out.println("Введите число:");

        int b = sc.nextInt();

        sc.close();

        int k =a + b;

        System.out.println("DEC"+":"+ a + "+" + b + "=" + k);

        System.out.println("BIN"+":"+ Integer.toBinaryString (a) + "+" + Integer.toBinaryString (b) + "=" + Integer.toBinaryString (k));

        System.out.println("OKT"+":"+ Integer.toOctalString (a) + "+" + Integer.toOctalString (b) + "=" + Integer.toOctalString (k));

        System.out.println("HEX"+":"+ Integer.toHexString (a) + "+" + Integer.toHexString (b) + "=" + Integer.toHexString (k));
    }
}