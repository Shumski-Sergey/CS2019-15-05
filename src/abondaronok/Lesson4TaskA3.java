package abondaronok;

import java.util.Scanner;

public class Lesson4TaskA3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        check1(in.nextInt(), in.nextInt(), in.nextInt());
    }
    private static void check1(int a, int b, int c) {
        System.out.println("Введенные числа: " + a + ", " + b + ", " + c );
            String d;
            d = "";
            if ( a == b || a == c) {
                d = a + " ";
            }
            if ( a == b || b == c) {
                d = d + b + " ";
            }
            if ( c == a || c == b) {
                d = d + c;
            }
        System.out.print("Были введены следующие парные числа: " + d);
    }
}

