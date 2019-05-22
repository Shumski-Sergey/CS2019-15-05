package gabrusev.lesson3;

import java.util.Scanner;

public class lesson3_a_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double a = sc.nextDouble() ;
        double b = sc.nextDouble() ;
        System.out.println((int)a + " " + (int)b);
        double sum,raz,mn,del,ost;
        sum = a + b;
        raz = a - b;
        mn = a * b;
        del = a / b;
        ost = a % b;
        System.out.println((int)sum + " " + (int)raz + " " + (int)mn + " " + (int)del + " " + (int)ost);
        System.out.println(sum + " " + raz + " " + mn + " " + del + " " + ost);
    }
}
