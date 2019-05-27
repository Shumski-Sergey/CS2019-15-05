package belov.Lesson3;

import java.util.Scanner;

public class Lesson3TaskC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четырехзначное число: ");
        System.out.print("Результат: "+sumDigitsInNumber(sc.nextInt()));

    }

    private static int sumDigitsInNumber(int number) {
        int digit, sum=0, i;
        for(i=1000; i>=1; i/=10) {
            digit = number/i;
            number %= i;
            sum += digit;
        }
            return sum;
    }

}
