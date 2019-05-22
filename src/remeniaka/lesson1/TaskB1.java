package remeniaka.lesson1;

import java.util.Scanner;
public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();


        System.out.println("Введено число:" + a*a);

    }
}
