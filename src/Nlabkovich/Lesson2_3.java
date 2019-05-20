package Nlabkovich;

import java.util.Scanner;

public class Lesson2_3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int число = in.nextInt();
        in.close();
        System.out.println("Квадрат введенног числа равняется\n" + число*число);
        System.out.println(число*число);


    }
}
