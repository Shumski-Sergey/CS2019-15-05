package Romanovskaya.Lesson2Homework;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        System.out.print ("Введите любое целое число:");
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Ваше чиcло в квадрате:" + a*a);
    }

}
