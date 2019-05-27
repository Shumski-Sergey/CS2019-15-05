package belov.Lesson3;

import java.util.Scanner;

public class Lesson3TaskC1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в градусах цельсия: ");
        double TF = convertCelsiusToFahrenheit(sc.nextInt());
        System.out.println(TF+" Фаренгейт");
    }

    private static double convertCelsiusToFahrenheit(int celsius) {
        double TF;
        TF = celsius / 5*9 + 32;
        return TF;
    }

}
