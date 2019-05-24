package oschasnaya.L4;

import java.util.Scanner;

public class Lesson4_TaskA3 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }
        else if (a == b) {
            System.out.println(a + " " + b);
        }
        else if (b == c) {
            System.out.println(b + " " + c);
            }
        else if (a == c) {
            System.out.println(a + " " + c);
        }
        }
        }
