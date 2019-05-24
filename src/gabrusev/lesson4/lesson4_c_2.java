package gabrusev.lesson4;

import java.util.Scanner;

public class lesson4_c_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        for (int i = month; i <= 12; i++) {
            if (i == 1) {
                System.out.println(day);
            } else if (i == 2) {
                for (int j = day; j <= 28; ) {
                    System.out.println(day+28);
                    break; // и так далее по месяцам
                }
            }
        }
    }
}
