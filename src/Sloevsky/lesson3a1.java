package Sloevsky;

import java.util.Scanner;

public class lesson3a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println((i+j) + " " + (i-j) + " " + (i*j) + " " + (i/j) + " " + (i%j));
        System.out.println("" +
                "");
        System.out.println((double)(i+j) + " " + (double)(i-j) + " " + (double)(i*j) + " "
    + (double)(i/j) + " " + (double)(i%j));
    }
}
