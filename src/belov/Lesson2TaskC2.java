package belov;

import java.util.Scanner;

public class Lesson2TaskC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum  = num1 + num2;

        System.out.println("DEC:" + num1 + "+" + num2 + "=" + sum);
        System.out.println("BIN:" + Integer.toBinaryString(num1) + "+" + Integer.toBinaryString(num2)
                + "=" + Integer.toBinaryString(sum));
        System.out.println("HEX:" + Integer.toHexString(num1) + "+" + Integer.toHexString(num2)
                + "=" + Integer.toHexString(sum));
        System.out.println("OKT:" + Integer.toOctalString(num1) + "+" + Integer.toOctalString(num2)
                + "=" + Integer.toOctalString(sum));

    }

}
