package abondaronok;

import java.util.Scanner;

public class Lesson3TaskB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        dis(in.nextInt(), in.nextInt(), in.nextInt());
    }

    private static void dis(int a, int b, int c) {
        double D;
        D = Math.round( b * b - 4 * a * c * 100 ) / 100.00;
        dis_check(a, b, D);
    }

    private static void dis_check(double a, double b, double d) {
        if (d >= 0) {
            System.out.println("Дискриминант равен :" + d);
            roots(a, b, d);
        } else {
            System.out.println("Отрицательный дискриминант - нет решений");
        }
    }

    private static void roots(double a, double b, double d) {
        double x0, x1, x2;
        x0 = Math.round( -b / (2 * a) * 100) / 100.00;
        x1 = Math.round( -b - Math.sqrt(d) / (2 * a) * 100) / 100.00;
        x2 = Math.round( -b + Math.sqrt(d) / (2 * a) * 100) / 100.00;
        if (d > 0) {
            System.out.println("Дискриминант положительный, => корни уравнения равны: " + x1 + " и " + x2);
        } else if (d == 0) {
            System.out.println("Дискриминант уравнения равен 0, => корень равен: " + x0);
        }
    }
}
