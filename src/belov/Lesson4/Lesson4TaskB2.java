package belov.Lesson4;

import java.util.Scanner;

public class Lesson4TaskB2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int size = sc.nextInt();
        int column;
        int row = 1;

        while (row <= size) {
            column = 1;
            while (column <= size) {
                System.out.print(column * row + " ");
                column++;
            }
            System.out.println();
            row++;
        }

    }
}