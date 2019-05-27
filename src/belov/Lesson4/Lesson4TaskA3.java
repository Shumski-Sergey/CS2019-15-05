package belov.Lesson4;

import java.util.Scanner;

public class Lesson4TaskA3 {
    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if(num1 == num2 && num1 == num3) {
            System.out.print(num1 + " "+ num2 + " " + num3); }
        else if (num1 == num2) {
            System.out.print(num1 + " "+ num2); }
        else if (num1 == num3) {
            System.out.print(num1 + " " + num3); }
        else if (num2 == num3) {
            System.out.print(num2 + " " + num3); }
    }
}
