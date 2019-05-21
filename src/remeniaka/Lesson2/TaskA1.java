package remeniaka.Lesson2;

import java.util.Scanner;
public class TaskA1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");

        int a = sc.nextInt();

        System.out.println("Введите число:");

        int b = sc.nextInt();

        sc.close();

        int c = a + b;
        int p = a - b;
        int m = a * b;
        int n = a / b;
        int s = a % b;

        Double k = (double) c;
        Double x = (double) p;
        Double u = (double) m;
        Double l = (double) n;
        Double t = (double) s;

        System.out.println(("суммa чисел ") + c +" " +("Разность чисел ") + p +" " +("Произведение чисел ") + m +" "+("Частное чисел ") + n+" " + ("Остаток от деления ") + s);


        System.out.println(("суммa чисел ") + k +" " +("Разность чисел ") + x +" " +("Произведение чисел ") + u +" "+("Частное чисел ") + l+" " + ("Остаток от деления ") + t);





    }
}