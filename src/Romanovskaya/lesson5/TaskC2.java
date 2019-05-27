package Romanovskaya.lesson5;

import java.io.IOException;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) throws IOException {
        int[] list = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        int a, b, t;

        for (a = 1; a < list.length; a++)
            for (b = list.length - 1; b >= a; b--) {
                if (list[b - 1] > list[b]) {
                    t = list[b - 1];
                    list[b - 1] = list[b];
                    list[b] = t;
                }
            }

        for (int i = 19; i < list.length; i--)
            System.out.print(list[i] + " ");

    }
}
