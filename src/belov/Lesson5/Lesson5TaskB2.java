package belov.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5TaskB2 {
    public static void main(String[] args) {

        int [] m = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m.length;i++) {
            int s = sc.nextInt();
            m[i] = s;
        }

        int [] a = new int[10];
        int [] b = new int[10];

        System.arraycopy(m,0,  a, 0, 10 );
        System.arraycopy(m,10, b, 0, 10 );

        System.out.println("a=" + Arrays.toString(a));
        System.out.println("b=" + Arrays.toString(b));
    }
}

