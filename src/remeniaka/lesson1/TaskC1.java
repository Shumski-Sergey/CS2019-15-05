package remeniaka.lesson1;

import java.util.Scanner;
public class TaskC1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int a = sc.nextInt();

        System.out.println("Введите число:");
        int b = sc.nextInt();
        sc.close();

        int c = a + b;

        System.out.println( ("суммa чисел ") + c);

    }
}
