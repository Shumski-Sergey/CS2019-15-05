package oschasnaya;

import java.util.Scanner;

public class Lesson3_TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру в C");
        double TF = convertCelsiumToFahrenheit (sc.nextInt());
        System.out.println(TF + " F");
    }

    private static double convertCelsiumToFahrenheit (int TC) {
        double TF;
        TF = TC / 5 * 9 + 32;
        return TF;
    }
}