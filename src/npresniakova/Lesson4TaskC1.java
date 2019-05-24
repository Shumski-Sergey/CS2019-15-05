package npresniakova;

import java.util.Scanner;

public class Lesson4TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую Вы хотите зарплату в $$$?:");
        int i = sc.nextInt();
        if (i < 300 || i > 3000) {
            System.out.println("Мы Вам перезвоним!");
        } else {
            for (int month = 0; month <15; month++) {
                if (month > 5 && month < 9) {
                    String m = null;
                    if (month == 6) {
                        m = "Июнь";
                    } else if (month == 7) {
                        m = "Июль";
                    } else {
                        m = "Август";
                    }
                    System.out.println(m +"-"+ i + "$");
                } else if (month == 0 || month == 13 || month == 14) System.out.println(0.00 + "$");
                else {
                    System.out.println(i * 1.5 + "$");
                }
                if (i ==666 || (i*1.5) == 666) { break;
                }
            }
        }
    }
}