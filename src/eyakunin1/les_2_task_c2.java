package eyakunin1;

import java.util.Scanner;

import static java.lang.System.*;

public class les_2_task_c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Ввод:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println ("DEC: " + a + "+" + b + "=" + (a+b));
        System.out.println ("BIN: " + Integer.toBinaryString(a)+ "+" + Integer.toBinaryString(b) + "="+ Integer.toBinaryString(a + b));
        System.out.println ("HEX: " + Integer.toHexString(a) + "+" + Integer.toHexString(b) + "+" + "=" + Integer.toHexString(a+b));
        System.out.println ("OKT: " + Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "+" + "=" + Integer.toOctalString(a+b));
    }
}

