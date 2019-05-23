package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskB1 {
    public static void main(System[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a > 0) {
            a++;
        }
        while (b > 0) {
            b++;
        }
        System.out.println(a * b + " ");
    }
}

