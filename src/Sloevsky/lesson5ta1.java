package Sloevsky;

import java.util.Scanner;

public class lesson5ta1 {
    public static void main(String[] args) {
        {System.out.println("Введите 10 целых чисел");}
    Scanner sc = new Scanner(System.in);

    int h;
    int[] mass = new int [10];
    for (int i = 0; i < mass.length; i++)
        {
        mass[i] = sc.nextInt();
        }
    for (int i = 0, j = mass.length - 1; i < j; ++i, --j )
        {
        h = mass[i];
        mass[i] = mass[j];
        mass[j] = h;
        }
    for (int i : mass) {
        System.out.println(i);
        }

}
}


