package belov.Lesson3;

import java.util.Scanner;

public class Lesson3TaskA1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два целых числа:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum, sub, mult, dev, rem;
        double sumD, subD, multD, devD, remD;

        sum = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        dev = num1 / num2;
        rem = num1 % num2;

        sumD = (double) num1 + (double) num2;
        subD = (double) num1 - (double) num2;
        multD = (double) num1 * (double) num2;
        devD = (double) num1 / num2;
        remD = (double) num1 % (double) num2;

        System.out.print(sum + " " + sub + " " + mult + " " + dev + " " + rem + " " + sumD + " " + subD + " "
                + multD + " " + devD + " " + remD);

    }
}
