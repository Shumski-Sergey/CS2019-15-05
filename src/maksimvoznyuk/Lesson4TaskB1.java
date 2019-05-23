package maksimvoznyuk;

import java.util.Scanner;

public class Lesson4TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размеры таблицы: ");
        int x = sc.nextInt();
        int a=1;

            while (a<=x) {
                int b = 1;
                while (b <= x) {
                    System.out.print(a * b + " ");
                    b++;
                }
                System.out.println("");
                a++;
            }
        }
    }

