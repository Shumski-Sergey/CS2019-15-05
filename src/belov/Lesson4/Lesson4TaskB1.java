package belov.Lesson4;

import java.util.Scanner;

public class Lesson4TaskB1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Количество дней в году: " + 366);
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Количество дней в году: " + 366);
        }
        else {
            System.out.println("Количество дней в году: " + 365);

        }
    }
}