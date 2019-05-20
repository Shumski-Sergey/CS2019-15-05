package remeniaka.lesson1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class TaskC3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");

        int Weight = sc.nextInt(); }

        public static double getWeight(int x) {

        double z = 9.81;
        double y = 3.86;
        double n = z / y;
        double a = x * n;

            double newDouble =new BigDecimal(a).setScale(2, RoundingMode.UP).doubleValue();

            return newDouble;
        }

}
