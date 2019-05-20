package abondaronok;

import java.util.Scanner;

public class Lesson3TaskA1 {
    public static void main(String[] args) {
        int number_1, number_2;
        Scanner scanner_1 = new Scanner(System.in);
        Scanner scanner_2 = new Scanner(System.in);
            System.out.println("Enter 1st number: ");
                number_1 = scanner_1.nextInt();
            System.out.println("Enter 2st number: ");
                number_2 = scanner_2.nextInt();

        int sum = number_1 + number_2;
        int razn = number_1 - number_2;
        int product = number_1 * number_2;
        int div = number_1 / number_2;
        int ostat = number_1 % number_2;

        double sum_d = (double) number_1 + number_2;
        double razn_d = (double) number_1 - number_2;
        double product_d = (double) number_1 * number_2;
        double div_d = (double) number_1 / number_2;
        double ostat_d = (double) number_1 % number_2;

        System.out.println("INT: " + sum + " " + razn + " " + product + " " + div + " " + ostat);
        System.out.println("DOUBLE: " + sum_d + " " + razn_d + " " + product_d + " " + div_d + " " + ostat_d);
    }
}
