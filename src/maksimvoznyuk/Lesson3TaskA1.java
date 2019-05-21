package maksimvoznyuk;

import java.util.Scanner;

public class Lesson3TaskA1 {
    //функции для типа integer
    private static int sum (int a, int b) {
        int sum = a + b;
        return sum;
    }

    private static int razn (int a, int b){
        int razn = a-b;
        return razn;
    }

    private static int proizv (int a, int b){
        int proizv = a*b;
        return proizv;
    }

    private static int del (int a, int b){
        int del = a/b;
        return del;
    }

    private static int cel (int a, int b){
        int cel = a%b;
        return cel;
    }

    //функции для типа double
    private static double sumd (int a, int b) {
        double sumd = a + b;
        return sumd;
    }

    private static double raznd (int a, int b){
        double raznd = a-b;
        return raznd;
    }

    private static double proizvd (int a, int b){
        double proizvd = a*b;
        return proizvd;
    }

    private static double deld (int a, int b){
        double deld = (double)a/b;
        return deld;
    }

    private static double celd (int a, int b){
        double celd = a%b;
        return celd;
    }

    public static void main (String args []){
        System.out.println ("Введите число 1: ");
        Scanner scan = new Scanner(System.in);
        int ch1 = scan.nextInt();
        System.out.println ("Введите число 2: ");
        int ch2 = scan.nextInt();

        int sum1=sum(ch1, ch2); int razn1 =razn(ch1, ch2); int proizv1=proizv(ch1, ch2); int del1=del(ch1,ch2); int cel1=cel(ch1,ch2);
        double sumd2=sumd(ch1,ch2); double raznd2=raznd(ch1,ch2); double proizvd2=proizvd(ch1,ch2); double deld2= deld(ch1, ch2); double celd2=deld(ch1,ch2);


        System.out.println(sum1+" "+razn1+" "+proizv1+" "+del1+" "+cel1);
        System.out.println(sumd2+" "+raznd2+" "+proizvd2+" "+deld2+" "+celd2);
    }
}
