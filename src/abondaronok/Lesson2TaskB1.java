package abondaronok;

import java.util.Scanner;
public class Lesson2TaskB1 {
    public static void main(String[] args) {
        Scanner scanner_1 = new Scanner(System.in);
            Integer number;
                System.out.print("Enter number: ");
                    number = scanner_1.nextInt();
                        int number_squared = number * number;
                        System.out.println("The square of this number is " + number_squared);
    }
}
