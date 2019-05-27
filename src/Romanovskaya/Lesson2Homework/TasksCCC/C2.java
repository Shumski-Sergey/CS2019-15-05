package Romanovskaya.Lesson2Homework.TasksCCC;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("Enter second number:");
        int b = scn.nextInt();
        int c = a+b;
        System.out.println("DEC :" + a + "+" +  b  + "="+ c );

        String Hexa = Integer.toHexString(a);
        String Hexb = Integer.toHexString(b);
        String Hexc = Integer.toHexString(c);
        System.out.println("HEX :" + Hexa+ "+" + Hexb+ "=" + Hexc);

        String Bina = Integer.toBinaryString(a);
        String Binb = Integer.toBinaryString(b);
        String Binc = Integer.toBinaryString(c);
        System.out.println("BIN :" + Bina + "+" + Binb + "=" + Binc);

        String Okta = Integer.toOctalString(a);
        String Oktb = Integer.toOctalString(b);
        String Oktc = Integer.toOctalString(c);
        System.out.println("OKT :" + Okta + "+" + Oktb + "=" + Oktc);





    }
}
