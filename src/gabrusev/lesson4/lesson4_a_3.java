package gabrusev.lesson4;


import java.util.Scanner;

public class lesson4_a_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            System.out.println("Числа a и b равны " + a);
        } else if (a == c) {
            System.out.println("Числа a и c равны " + a);
        } else if (b == c) {
            System.out.println("Числа b и c равны " + b);
        } else if (a != b && a != c){
            System.out.println();
        } else {
            System.out.println(("Нет равных чисел"));
        }
    }

}