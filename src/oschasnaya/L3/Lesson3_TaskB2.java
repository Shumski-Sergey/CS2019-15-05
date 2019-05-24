package oschasnaya.L3;

import java.util.Scanner;

public class Lesson3_TaskB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите 3 числа");
        dis(in.nextInt(), in.nextInt(), in.nextInt());
    }

    private static void dis (double a, double b, double c) {
        double D;
        D = b * b - 4 * a * c;
        ifOperand(a, b, D);
    }

    private static void ifOperand (double a, double b, double D) {
        if (D > 0) {
            twoD(a, b, D);
        } else if (D == 0) {
            oneD(a, b);
        } else {
            System.out.println("Отрицательный дискриминант");
        }
    }

    private static void oneD (double a, double b) {
        double x;
        x = -b / 2 * a;
        System.out.println(x);
    }

    private static void twoD (double a, double b, double d) {
        double x1, x2;
        x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
        x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
        System.out.println(x1 + " " + x2);
        }
    }
