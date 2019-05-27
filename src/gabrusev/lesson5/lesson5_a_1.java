package gabrusev.lesson5;

import java.util.Scanner;

public class lesson5_a_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        int[] mass = new int [10];
        for (int i = 0; i < mass.length; i++){
            mass[i] = sc.nextInt();
        }
        for (int i = 0, j = mass.length - 1; i < j; ++i, --j ) {
            t = mass[i];
            mass[i] = mass[j];
            mass[j] = t;
        }
        for (int i : mass){
            System.out.println(i);
        }
    }
}
