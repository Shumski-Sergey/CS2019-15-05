package belov;

import java.util.Scanner;

public class Lesson4TaskB3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

        do {
            sum += i++;
            System.out.print(sum + ",");
            } while ((sum + i) <= num);
    }
}
