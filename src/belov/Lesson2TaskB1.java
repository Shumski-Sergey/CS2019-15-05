package belov;

import java.util.Scanner;

public class Lesson2TaskB1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");

        int a = sc.nextInt();
        a *= a;
        System.out.println("Квадрат введенного Вами числа =" + a);
    }
}
