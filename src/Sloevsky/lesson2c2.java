package Sloevsky;


import java.util.Scanner;

public class lesson2c2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int i = sc.nextInt();
        int j = sc.nextInt();
        int sum = i + j;

        System.out.println("DEC:" + i + "+" + j + "=" + sum);
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(j)
                + "=" + Integer.toBinaryString(sum));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(j)
                + "=" + Integer.toHexString(sum));
        System.out.println("OKT:" + Integer.toOctalString(i) + "+" + Integer.toOctalString(j)
                + "=" + Integer.toOctalString(sum));

    }
}