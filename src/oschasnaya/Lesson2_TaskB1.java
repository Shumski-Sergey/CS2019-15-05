package oschasnaya;

import java.util.Scanner;

public class Lesson2_TaskB1 {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Введите число для возведения в квадрат");
        int a = sc.nextInt();
        int b = a*a;
        System.out.println("Ответ "+ b);
    }

}
