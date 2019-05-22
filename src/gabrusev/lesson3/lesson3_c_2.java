package gabrusev.lesson3;

import java.util.Scanner;

public class lesson3_c_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sum(number));
        }
        private static int sum (int number){
        int n1000 = number / 1000;
        int a = number - n1000 * 1000;
        int n100 = a / 100;
        int b = a - n100 * 100;
        int n10 = b / 10;
        int n1 = b - n10 * 10;
        return n1000 + n100 + n10 + n1;
        }

    }
