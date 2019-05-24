package oschasnaya.L4;

import java.util.Scanner;

public class Lesson4_TaskB1 {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("количество дней в году: 366");
        }
        else {
            System.out.println("количество дней в году: 365");
        }
        }
    }
