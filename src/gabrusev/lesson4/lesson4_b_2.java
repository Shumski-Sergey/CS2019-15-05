package gabrusev.lesson4;

import java.util.Scanner;

public class lesson4_b_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int i = 1;

        while (i <= size) {
            int j = 1;
            while (j <= size) {
                System.out.print(i * j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
