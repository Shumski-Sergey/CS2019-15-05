package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int number = scan1.nextInt();
        int a = 0;
        int x = 1;
        do{
            a+=x++;
            System.out.print( a + " ");
        }
        while ( ( a + x)<= number);
        }
    }

