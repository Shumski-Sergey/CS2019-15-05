package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan1.nextInt();
        int c = scan1.nextInt();
        if (a == b) {
            System.out.println(a + " " + b);
        }
        if (b == c) {
            System.out.println(b + " " + c);
        }
        if (a == c) {
            System.out.println(a + " " + c);
        } else {
            System.out.println( " " );
        }

    }
}
