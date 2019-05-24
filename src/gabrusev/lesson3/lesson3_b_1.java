package gabrusev.lesson3;

import java.util.Scanner;

public class lesson3_b_1<dis> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        dis(a,b,c);
    }

    private static void dis(double a, double b, double c) {
        double d;
        d = b * b - 4 * a * c ;
        abc (a,b,d);
    }
    private static void abc(double a, double b, double d) {
        if (d > 0) {
            tD (a,b,d);
        } else if (d == 0) {
            oD (a,b,d) ;
            } if (d < 0) {
         System.out.println("Уравнение не имеет корней");
            }
    }
    private static void tD(double a, double b, double d) {
        double x1, x2;
        x1 = ((-1) * b + Math.sqrt(d)) / (2 * a) ;
        x2 = ((-1) * b - Math.sqrt(d)) / (2 * a) ;
        System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
    }
    private static void oD(double a, double b, double d) {
        double x;
        x = ((-1) * b + Math.sqrt(d)) / (2 * a) ;
        System.out.println("x = " + x);
    }

}
