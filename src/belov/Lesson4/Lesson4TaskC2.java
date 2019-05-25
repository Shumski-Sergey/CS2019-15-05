package belov.Lesson4;

import java.util.Scanner;

public class Lesson4TaskC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число и номер месяца (дд мм): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int [] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
        int dayOfYear = 0;

        for (int i = 0; i < month; i++) {
            dayOfYear += daysInMonths[i];
        }

        dayOfYear = dayOfYear - (daysInMonths[month-1] - day);
        System.out.println();
        System.out.print(dayOfYear);

    }
}