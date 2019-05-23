package abondaronok;

import java.util.Scanner;

public class Lesson4TaskB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        vvod(in.nextInt());
    }
    private static void vvod (int a) {
        boolean x = a % 4 == 0;
        boolean y = a % 400 == 0;
        boolean z = a % 100 == 0;
        if (x && !z) {
            System.out.println("Количество дней в году: 366");
        }
        else if ( y ){
            System.out.println("Количество дней в году: 366");
        }
        else {
            System.out.println("Количество дней в году: 365");
        }
    }
}
