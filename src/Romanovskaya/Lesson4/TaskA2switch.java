package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskA2switch {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскреенье");
                break;
                default:
                    System.out.println("Такого дня недели не существует!!!");
        }

    }
}
