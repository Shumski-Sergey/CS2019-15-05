package Romanovskaya.Lesson3;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println((a+b)+ " " + (a-b)+ " " + (a*b)+ " "+(a/b)+ " "+ (a%b));
        double c = a;
        double d = b;
        System.out.println((c+d)+ " " + (c-d)+ " " + (c*d)+ " "+(c/d)+ " "+ (c%d));




    }

}

