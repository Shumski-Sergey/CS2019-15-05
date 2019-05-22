package belov;

import java.util.Scanner;

public class Lesson3TaskB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите три целых числа:");
        dis(in.nextInt(), in.nextInt(), in.nextInt());
    }

    private static void dis(double a, double b, double c) {
        double d;
        d = b * b - 4 * a * c;
     //   System.out.println(d);
        ifOperand(a, b, d);
    }

    private static void ifOperand(double a, double b, double d) {
        if (d > 0) {
            tooD(a, b, d);
        } else if (d == 0) {
            oneD(a, b);
        } else {
            System.out.println("Отрицацельный дискриминант");
        }
    }

    private static void oneD(double a, double b) {
        double x;
        x = -b / (2 * a);
        System.out.println(x);
    }

    private static void tooD(double a, double b, double d) {
        double x1, x2;
        x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
        x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
        System.out.println(x1 + " " + x2);
    }
}
