package abondaronok;

import java.util.Scanner;

public class Lesson2TaskC2 {
    public static void main(String[] args) {
        Scanner scanner_1 = new Scanner(System.in);
        Integer number_1;
        System.out.println("Enter 1st number: ");
        number_1 = scanner_1.nextInt();
            Scanner scanner_2 = new Scanner(System.in);
            Integer number_2;
            System.out.println("Enter 2nd number: ");
            number_2 = scanner_2.nextInt();
                Integer sum_1_and_2 = number_1 + number_2;
                    String number_1_binary = Integer.toBinaryString(number_1);
                    String number_2_binary = Integer.toBinaryString(number_2);
                    String sum_1_and_2_binary = Integer.toBinaryString(sum_1_and_2);
                        String number_1_octal = Integer.toOctalString(number_1);
                        String number_2_octal = Integer.toOctalString(number_2);
                        String sum_1_and_2_octal = Integer.toOctalString(sum_1_and_2);
                            String number_1_hex = Integer.toHexString(number_1);
                            String number_2_hex = Integer.toHexString(number_2);
                            String sum_1_and_2_hex = Integer.toHexString(sum_1_and_2);
            System.out.printf("%s %s %s %s %s %s %n","Decimal : ", number_1, " + ", number_2, " = " , sum_1_and_2);
            System.out.printf("%s %s %s %s %s %s %n","Binary : ", number_1_binary, " + ", number_2_binary, " = " , sum_1_and_2_binary);
            System.out.printf("%s %s %s %s %s %s %n","Octal : ", number_1_octal, " + ", number_2_octal, " = " , sum_1_and_2_octal);
            System.out.printf("%s %s %s %s %s %s","Hex : ", number_1_hex, " + ", number_2_hex, " = " , sum_1_and_2_hex);
    }
}
