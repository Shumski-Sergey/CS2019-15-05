package maksimvoznyuk;

import java.util.Scanner;

public class Lesson3TaskB1 {
    public static void main(String [] args) {
        System.out.println("ax2+bx+c=0" + "\n" + "Введите a, b, c: ");
        Scanner scan = new Scanner(System.in);
        dis(scan.nextInt(), scan.nextInt(), scan.nextInt());
    }

        private static void dis(int a, int b, int c) {
            double D;
            D = Math.round( b*b - 4 * a * c );

            if (D >= 0) {
                System.out.println("Дискриминант равен :" + D);
                solution (a,b,D);
            } else {
                System.out.println("Отрицательный дискриминант");
            }
        }

        private static void solution(double a, double b, double D) {
        double x0, x1, x2;
            x0 = ( -b / (2 * a) );
            x1 = ( -b - Math.sqrt(D) / (2 * a) );
            x2 = ( -b + Math.sqrt(D) / (2 * a) );
            if (D > 0) {
                System.out.println("Дискриминант положительный, => корни уравнения равны: " + x1 + " и " + x2);
            } else if (D == 0) {
                System.out.println("Дискриминант уравнения равен 0, => корень равен: " + x0);
            }

//        }
    }
}