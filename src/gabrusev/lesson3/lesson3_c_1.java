package gabrusev.lesson3;

import java.util.Scanner;

public class lesson3_c_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celToFar = sc.nextInt();

        System.out.println(convert(celToFar));
    }
    private static double convert (int celToFar){

        return (double) celToFar / 5 * 9 + 32;
    }
}
