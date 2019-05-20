package oschasnaya;

import java.util.Scanner;

public class Lesson3_TaskA1 {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите числа");
        int l = sc.nextInt();
        int m = sc.nextInt();
        int sum = l + m;
        int sub = l - m;
        int mul = l * m;
        int div = l / m;
        int mod = l % m;
        System.out.println(sum + ", " + sub + ", " + mul + ", " + div + ", " + mod);
        double dsum = l + m;
        double dsub = l - m;
        double dmul = l * m;
        double ddiv = l / m;
        double dmod = l % m;
        System.out.println(dsum + ", " + dsub + ", " + dmul + ", " + ddiv + ", " + dmod);
    }
}
