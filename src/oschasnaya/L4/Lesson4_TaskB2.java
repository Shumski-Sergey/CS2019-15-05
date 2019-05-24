package oschasnaya.L4;

import java.util.Scanner;

public class Lesson4_TaskB2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a = 1;
        int b;

        while (a <= size) {
            b = 1;
            while (b <= size) {
                System.out.print(a * b + " ");
                b++;
            }
            System.out.println();
            a++;
        }
        }
    }