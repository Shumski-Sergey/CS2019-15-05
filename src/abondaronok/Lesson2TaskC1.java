package abondaronok;

import java.util.Scanner;

public class Lesson2TaskC1 {
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
                        System.out.println("The sum of numbers typed above = " + sum_1_and_2);
    }
}
