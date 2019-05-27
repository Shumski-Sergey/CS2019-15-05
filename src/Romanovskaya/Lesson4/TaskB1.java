package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int horizontal;
        int vertical=1;

        while (vertical <= number) {
            horizontal = 1;
            while (horizontal <= number) {
                System.out.print(vertical * horizontal + " ");
                horizontal++;
            }
            System.out.println();
            vertical++;
        }
    }
}

