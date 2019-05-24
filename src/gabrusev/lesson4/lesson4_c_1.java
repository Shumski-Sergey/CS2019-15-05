package gabrusev.lesson4;

import java.util.Scanner;

public class lesson4_c_1 {
    public static void main(String[] args) {
        System.out.print("Какую вы хотите зарплату? ");
        Scanner sc = new Scanner(System.in);
        int zp = sc.nextInt();
        if (zp < 300 || zp > 3000){
            System.out.println("Мы вам перезвоним");
        } else {
            for (int month = 0; month <= 14; month++){
                if (month > 5 && month < 9) {
                    String m;
                    if (month == 6) {
                        m = "Июнь";
                    } else if (month == 7) {
                        m = "Июль";
                    } else {
                        m = "Август";
                    }
                    System.out.println(m + " - " + zp + "$");
                } else if (month == 0 || month == 13 || month == 14) {
                    System.out.println(0.0 + "$");
                } else {
                    System.out.println(zp * 1.5 + "$");
                }
                if (zp == 666 || (zp*1.5) == 666 ){
                    break;
                }
            }
        }
    }
}
