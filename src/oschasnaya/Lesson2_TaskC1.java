package oschasnaya;

import java.util.Scanner;

public class Lesson2_TaskC1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите 2 числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Ответ " + c);
    }

}
