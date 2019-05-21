package Sloevsky;

import java.util.Scanner;

public class lesson2c1 {
    public static void main(String[] args) {
        System.out.println("Введите два любых числа:");
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = i + j;
        System.out.println(k);

    }
}
