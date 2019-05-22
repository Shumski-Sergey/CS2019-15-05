package npresniakova;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int b = a*a;
        sc.close();
        System.out.print( "Квадрат числа:" + b);

    }
}
